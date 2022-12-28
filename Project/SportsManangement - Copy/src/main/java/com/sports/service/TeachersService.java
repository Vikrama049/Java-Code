package com.sports.service;

import java.util.List;

import com.sports.entity.Teachers;
import com.sports.model.TeachersDto;




public interface TeachersService {

	String createCoach(Teachers coach);
	TeachersDto updateCoach(int id,Teachers coach);
	TeachersDto getCoachById(int id);	
	List<TeachersDto> getAllCoaches();
	String deleteCoachById(int id);
	void deleteAllCoaches();
	List<TeachersDto> getCoachByCoach_name(String coach_name);
	List<TeachersDto> getCoachByPhone_no(long phone_no);
	List<TeachersDto>getCoachByCity(String city);
	
}
