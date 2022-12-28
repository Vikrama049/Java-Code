package com.sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports.entity.Teachers;
import com.sports.model.TeachersDto;
import com.sports.service.TeachersService;
import com.sports.util.TeachersConvertor;

@RestController
public class TeachersController {
	
	@Autowired
	private TeachersService teachersService;
	@Autowired
	private TeachersConvertor teachersConvertor;
	
	@PostMapping("/create")
	public String createteachers(@RequestBody TeachersDto teachersDto) {
		final Teachers teachers = teachersConvertor.convertteachersDtoToteachersEntity(teachersDto);
		return teachersService.createteachers(teachers);
	}
	
	@PutMapping("/update/{id}")
	public TeachersDto updateteachers(@PathVariable("id") int id,@RequestBody TeachersDto teachersDto) {
		Teachers teachers = teachersConvertor.convertteachersDtoToteachersEntity(teachersDto);
		return teachersService.updateteachers(id, teachers);
	}
	
	@GetMapping("/get/{id}")
	public TeachersDto getteachers(@PathVariable("id") int id) {
		return teachersService.getteachersById(id);
	}
	
	@GetMapping("/getAll")
	public List<TeachersDto> getAllteachers(){
		return teachersService.getAllteacherses();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteteachersById(@PathVariable("id") int id) {
		return teachersService.deleteteachersById(id);
	}
	
	@DeleteMapping("/deleteAllteachers")
	public ResponseEntity<String> deleteAllteachers(){
		teachersService.deleteAllteacherses();
		return new ResponseEntity<String>("All teachers Details Are Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/getByteachers_Name/{teachers_name}")
	public List<TeachersDto> getteachersByteachers_name(@PathVariable("teachers_name") String teachers_name){
		return teachersService.getteachersByteachers_name(teachers_name);
	}
	@GetMapping("/getByPhone_no/{phone_no}")
	public List<TeachersDto> getteachersByPhone_no(@PathVariable("phone_no") long phone_no){
		return teachersService.getteachersByPhone_no(phone_no) ;
	}
	
	@GetMapping("/getByteachersCity/{city}")
	public List<TeachersDto> getteachersByCity(@PathVariable("city") String city){
		return teachersService.getteachersByCity(city);
	}

}
