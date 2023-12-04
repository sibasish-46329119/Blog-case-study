package com.blogappspringboot.blog.service;

import com.blogappspringboot.blog.payload.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);
	
}
