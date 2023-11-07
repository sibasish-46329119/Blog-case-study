package com.blogappspringboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogappspringboot.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
