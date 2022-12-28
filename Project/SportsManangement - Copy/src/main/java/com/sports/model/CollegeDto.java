package com.sports.model;

import com.sports.entity.Teachers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CollegeDto {
	
	private int id;
	private String college_name;
	private String teachers_name;
	private String city;
	private String country;
	private Teachers coach;

}
