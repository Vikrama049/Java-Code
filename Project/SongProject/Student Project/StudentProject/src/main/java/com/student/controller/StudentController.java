package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.model.StudentDTO;
import com.student.service.StudentService;
import com.student.util.Converter;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private Converter converter;
	
	@PostMapping("/newStudent")
	public String createStudent(@RequestBody StudentDTO studentDTO)
	{
		final Student student= converter.convertToEntity(studentDTO);
	return studentService.createStudent(student);
	}
	

}
