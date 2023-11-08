package com.blogappspringboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	@NotEmpty(message="Title can't be empty")
	@Size(min=3,message="Title must be greater than 3 characters")
	private String categoryTitle;
	
	@Size(max=80,message="Description must not be greater than 80 characters")
	private String categoryDescription;
}
