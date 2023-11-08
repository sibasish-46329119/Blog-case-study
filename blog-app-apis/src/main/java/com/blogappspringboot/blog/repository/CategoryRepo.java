package com.blogappspringboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogappspringboot.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
