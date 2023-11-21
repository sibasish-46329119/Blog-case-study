package com.blogappspringboot.blog.service;

import java.util.List;

import com.blogappspringboot.blog.entities.Post;
import com.blogappspringboot.blog.payload.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	List<PostDto> getAllPosts(Integer pageNumber, Integer pageSize);
	
	PostDto getPostById(Integer postId);
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	List<PostDto> getPostByUser(Integer userId);
	
	List<Post> searchPosts(String keyword);
}
