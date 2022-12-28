package com.sports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sports.entity.Teachers;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers,Integer>{

	@Query("from Coach where teachers_name like :s%")
	List<Teachers> getCoachByCoach_name(@Param("s")String coach_Name);
	@Query("from Coach where teachers_no =:s")
	List<Teachers> getCoachByPhone_no(@Param("s")Long phone_no);
	@Query("from Coach where city like :s%")
	List<Teachers> getCoachByCity(@Param("s")String city);
	
}
