package com.sports.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Teachers;
import com.sports.entity.College;
import com.sports.exception.TeachersNotFoundException;
import com.sports.exception.CollegeNotFoundException;
import com.sports.model.CollegeDto;
import com.sports.repository.TeachersRepository;
import com.sports.repository.CollegeRepository;
import com.sports.service.CollegeService;
import com.sports.util.CollegeConvertor;

@Service
public  class CollegeServiceImp implements CollegeService{
	
	@Autowired
	private CollegeRepository teamsRepository;
	@Autowired
	private CollegeConvertor teamsConvertor;
	@Autowired
	private TeachersRepository coachRepository;

	
	@Override
	public String createTeam(College teams) {   //method for creating Team
		String message = null;
		teamsRepository.save(teams);  //saving bank to database
		if(teams!=null) {
			message = "New Team is formed";
		}
		return message;
	} //end of method


	@Override
	public CollegeDto updateTeam(int id, College teams) {
		// TODO Auto-generated method stub
		College getTeams = teamsRepository.findById(id).get();
		getTeams.setCollege_name(teams.getCollege_name());
		getTeams.setTeachers_name(teams.getTeachers_name());
		getTeams.setCity(teams.getCity());
		getTeams.setCountry(teams.getCountry());
		
		teamsRepository.save(getTeams);
		return teamsConvertor.convertTeamsEntityToTeamsDto(getTeams);
	}


	@Override
	public CollegeDto getTeamById(int id) {
		//method for getting Team by id
				College teams = teamsRepository.findById(id).get();		
				return teamsConvertor.convertTeamsEntityToTeamsDto(teams);
		
	}


	@Override
	public List<CollegeDto> getAllTeams() {
		//method for getting all id
				List<College> teams = teamsRepository.findAll();
				List<CollegeDto> teamsDto = new ArrayList<>();
				for(College a: teams) {
					teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
				}
				return teamsDto;
	}


	@Override
	public String deleteTeamById(int id) {
		//method for deleting team by id
				String message=null;
				Optional<College> teams=teamsRepository.findById(id);
				if(teams.isPresent()) {		
					teamsRepository.deleteById(id);
					message = "Team Deleted Successfully.....";
				}
				else {
					message = "Team Details are not found... ==> "+id+"\n ----Enter Correct Team Id !";
				}
				return message;
	}


	@Override
	public void deleteAllTeams() {
		//method for deleting all teams
				teamsRepository.deleteAll();
		
	}


	@Override
	public CollegeDto assignCoachToTeam(int id, int coachId) {
		//method for assigning coach to team
				College teams = teamsRepository.findById(id).orElseThrow(()-> new CollegeNotFoundException("Team","ID",id));
				Teachers coach = coachRepository.findById(coachId).orElseThrow(()-> new TeachersNotFoundException("Coach","ID",id));
				teams.setCoach(coach);
				teamsRepository.save(teams);
				return teamsConvertor.convertTeamsEntityToTeamsDto(teams);
	}


	@Override
	public List<CollegeDto> getTeamsByTeam_name(String team_name) {
		List<College> teams = teamsRepository.getTeamByTeam_name(team_name);
		List<CollegeDto> teamsDto = new ArrayList<>();
		for(College a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	@Override
	public List<CollegeDto> getTeamsBySport_name(String sport_name) {
		List<College> teams= teamsRepository.getTeamsBySport_name(sport_name);
		List<CollegeDto> teamsDto = new ArrayList<>();
		for(College a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}
		
	@Override
	public List<CollegeDto> getTeamsByCity(String city) {
		List<College> teams = teamsRepository.getTeamsByCity(city);
		List<CollegeDto> teamsDto = new ArrayList<>();
		for(College a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	
	}
	@Override
	public List<CollegeDto> getTeamsByCoach(int coachId) {
		List<College>teams= teamsRepository.getTeamsByCoach(coachId);
		List<CollegeDto> teamsDto = new ArrayList<>();
		for(College a : teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	

	
}