package com.sports.service;

import java.util.List;

import com.sports.entity.College;
import com.sports.model.CollegeDto;





public interface CollegeService {
	
	String createTeam(College team);
	CollegeDto updateTeam(int id,College team);
	CollegeDto getTeamById(int id);	
	List<CollegeDto> getAllTeams();
	String deleteTeamById(int id);
	void deleteAllTeams();
	CollegeDto assignCoachToTeam(int id, int coachId);
	
	List<CollegeDto> getTeamsByTeam_name(String team_name);
	List<CollegeDto> getTeamsBySport_name(String sport_name);
	List<CollegeDto> getTeamsByCity(String city);
	List<CollegeDto>getTeamsByCoach(int coach_id);
	
	
	
	
}

