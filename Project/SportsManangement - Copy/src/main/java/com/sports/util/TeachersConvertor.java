package com.sports.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sports.entity.Teachers;
import com.sports.model.TeachersDto;

@Component
public class TeachersConvertor {
	//Method for converting Dto to Entity
		public Teachers convertTeachersDtoToCoachEntity(TeachersDto TeachersDto) {
			
			Teachers coach =new Teachers(); //creation of object
			if(coach!=null) {
				BeanUtils.copyProperties(TeachersDto, coach); //copy properties of coach
			}
			return coach;
		}
		
		//Method for converting Entity to Dto
		public TeachersDto convertTeachersEntityToTeachersDto(Teachers Teachers) {
			TeachersDto coachDto =new TeachersDto(); //creation of object
			if(coachDto!=null) {
				BeanUtils.copyProperties(Teachers, coachDto); //copy properties of coachDto
			}
			return coachDto;
		}

}
