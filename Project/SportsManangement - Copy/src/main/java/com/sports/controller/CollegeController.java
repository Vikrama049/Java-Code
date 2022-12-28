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

import com.sports.entity.College;
import com.sports.model.CollegeDto;
import com.sports.service.CollegeService;
import com.sports.util.CollegeConvertor;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private CollegeConvertor collegeConvertor;
	
	@PostMapping("/createCollege")
	public String createCollege(@RequestBody CollegeDto CollegesDto) {
		final College Colleges = collegeConvertor.convertCollegesDtoToCollegesEntity(CollegesDto);
		return collegeService.createCollege(Colleges);
	}
	
	@PutMapping("/updateCollege/{id}")
	public CollegeDto updateCollege(@PathVariable("id") int id ,@RequestBody CollegeDto CollegesDto) {
		College college = collegeConvertor.convertCollegesDtoToCollegesEntity(CollegesDto);
		return collegeService.updateCollege(id, college);
		
	}
	
	@GetMapping("/getCollege/{id}")
	public CollegeDto getColleges(@PathVariable("id") int id) {
		return collegeService.getCollegeById(id);
	}
	
	@GetMapping("/getAllCollege")
	public List<CollegeDto> getAllCollege(){
		return collegeService.getAllCollege();
	}
	
	@DeleteMapping("/deleteCollege/{id}")
	public String deleteCollege(@PathVariable("id") int id) {
		return collegeService.deleteCollegeById(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		collegeService.deleteAllCollege();
		return new ResponseEntity<String>("All College Details Are Deleted" , HttpStatus.OK);
	}
	
	@PostMapping("/assign/{id}/{Teachers_id}")
	public ResponseEntity<String> assignCoachToCollegeId(@PathVariable("id") int id,@PathVariable("coachId") int coach_id) {
		collegeService.assignCoachToCollege(id, coach_id);
		return new ResponseEntity<String>("Coach is created having id :"+id+" is "+ coach_id ,HttpStatus.OK);
	}
	
	@GetMapping("/getByCollege_Name/{College_name}")
	public List<CollegeDto> getCollegesByCollege_name(@PathVariable("name") String College_name){
		return collegeService.getCollegesByCollege_name(College_name);
	}
	@GetMapping("/getBySportName/{student_name}")
	public List<CollegeDto> getCollegesBySport_name(@PathVariable("name") String sport_name){
		return collegeService.getCollegesBySport_name(sport_name);
	}
	@GetMapping("/getByTeachers/{Teachers}")
	public List<CollegeDto> getCollegesByTeachers(@PathVariable("Teachers") String Teachers){
		return collegeService.getCollegesByTeachers(Teachers);
	}
	
	@GetMapping("/getByCoach/{id}")
	public List<CollegeDto> getCollegesByCoach(@PathVariable("id") int coach_id){
		return collegeService.getCollegesByCoach(coach_id);
	}

}
