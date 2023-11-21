package com.blogappspringboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogappspringboot.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
