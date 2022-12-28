package com.sports.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sports.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer>{

	@Query("from Teams where college_name like :s%")
	List<College> getTeamByTeam_name(@Param("s") String team_name);
	@Query("from Teams where college_name like :s%")
	List<College> getTeamsBySport_name(@Param("s") String sport_name);
	@Query("from Teams where city like :s%")
	List<College>getTeamsByCity(@Param("s") String city);
	@Query("from Teams where college_id =:s")
	List<College> getTeamsByCoach(@Param("s") int id);
	
	
  
  
   
	 
}
