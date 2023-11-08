package com.blogappspringboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty(message="UserName can't be empty")
	@Size(min=4,message="Username must be greater than 4 characters")
	private String name;

	@Email(message="Email Id not valid")
	private String email;
	
	@NotEmpty(message="Password can't be empty")
	@Size(min=5, max=12, message="Password must be minimum 5 and maximum 12 character")
	private String password;
	
	@NotNull(message="About can't be null")
	private String about;
}
