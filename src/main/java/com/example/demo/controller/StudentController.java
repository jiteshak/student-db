package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.StudentDto;
import com.example.demo.response.GenralResponse;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping
    public ResponseEntity<GenralResponse> saveStudent(@Valid @RequestBody StudentDto studentDto) {
    	return ResponseEntity.ok().body(new GenralResponse(HttpStatus.OK,null,"Data Added",null, studentService.saveStudent(studentDto)));
    }
	
	
}
