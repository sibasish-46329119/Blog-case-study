package com.blogappspringboot.blog.service;

import java.util.List;

import com.blogappspringboot.blog.entities.Post;
import com.blogappspringboot.blog.payload.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	Post updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<Post> getAllPosts();
	
	Post getPostById(Integer postId);
	
	List<Post> getPostByCategory(Integer categoryId);
	
	List<Post> getPostByUser(Integer userId);
	
	List<Post> searchPosts(String keyword);
}
