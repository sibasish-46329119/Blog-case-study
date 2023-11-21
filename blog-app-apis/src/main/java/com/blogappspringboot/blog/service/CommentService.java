package com.blogappspringboot.blog.service;

import java.util.List;

import com.blogappspringboot.blog.payload.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer userId, Integer postId);
	
	void deleteComment(Integer commentId);
	
	List<CommentDto> getCommentById(Integer commentId);
}
