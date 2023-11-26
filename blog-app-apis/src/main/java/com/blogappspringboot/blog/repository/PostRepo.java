package com.blogappspringboot.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blogappspringboot.blog.entities.Category;
import com.blogappspringboot.blog.entities.Post;
import com.blogappspringboot.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	@Query("select p from Post p where p.title like :key")
	List<Post> searchByTitle(@Param("key")String title);
	
	//findByTitleContaing also works we can use that and it 
	//reduces the code via removing Query annotation and Param
	//annotation
	
	
}
