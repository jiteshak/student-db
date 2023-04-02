package com.example.demo.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sId", nullable = false)
	private Integer sId;
	
	@Column(name = "sName", nullable = false)
	private String sName;
	
	@Column(name = "sRollNo", nullable = false)
	private Integer sRollNo;
}
