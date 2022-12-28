package com.sports.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.sports.entity.College;
import com.sports.model.CollegeDto;

@Component
public class CollegeConvertor {
	//Method for converting Dto to Entity
		public College convertCollegeDtoToCollegeEntity(CollegeDto collegeDto) {
			
			College teams =new College(); //creation of object
			if(teams!=null) {
				BeanUtils.copyProperties(collegeDto, teams); //copy properties of teams
			}
			return teams;
		}
		
		//Method for converting Entity to Dto
		public CollegeDto convertCollegeEntityToCollegeDto(College College) {
			CollegeDto teamsDto = new CollegeDto(); //creation of object
			if(teamsDto!=null) {
				BeanUtils.copyProperties(College, teamsDto); //copy properties of TeamsDto
			}
			return teamsDto;
		}

}
