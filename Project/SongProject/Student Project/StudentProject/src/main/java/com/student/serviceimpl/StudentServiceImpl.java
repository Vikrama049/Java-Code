package com.student.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.util.Converter;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentRepository  studentRepository;
	
	@Autowired
	private Converter converter;

	@Override
	public String createStudent(Student student) {
		String message = null;
		studentRepository.save(student);
		if(student!=null)
		{
			message= "Student details saved successfully";
		}
		return message;
	}
	
}

	
	

