package com.example.demo.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	@NotEmpty
	@Size(min = 2, message = "student name should have at least 2 characters")
	private String sName;
	
	@NotNull
	private Integer sRollNo;
}
