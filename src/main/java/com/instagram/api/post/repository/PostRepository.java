package com.instagram.api.post.repository;

import com.instagram.api.post.domain.Post;
import com.instagram.api.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    void deleteAllByUser(User user);

//    @Query("select t from Post t join fetch t.user")
    List<Post> findAll();

//    @Query("select t from Post t join fetch t.user")
    List<Post> findAllByUser(User targetUser);
}
