package com.blogappspringboot.blog.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {

	private Integer commentId;
	private String comment;
	private PostDto post;
	
	private UserDto user;
	
}
