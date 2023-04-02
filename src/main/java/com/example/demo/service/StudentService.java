package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.dto.StudentDto;
import com.example.demo.repository.StudentRepository;
import com.example.demo.utils.ClassUtil;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentDto saveStudent(StudentDto studentDto) {

		Student student = new Student();
		Student saveStudent = studentRepository.save(student);
		BeanUtils.copyProperties(saveStudent, studentDto);
		return studentDto;
	}

}
