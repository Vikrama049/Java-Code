package com.sports.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.entity.Teachers;
import com.sports.exception.TeachersNotFoundException;
import com.sports.model.TeachersDto;
import com.sports.repository.TeachersRepository;
import com.sports.service.TeachersService;
import com.sports.util.TeachersConvertor;

@Service
public class TeachersServiceImp implements TeachersService {
	
	@Autowired
	private TeachersRepository coachRepository;  //instance of coachRepository
	
	@Autowired
	private TeachersConvertor coachConvertor;  //instance of coachConvertor

	@Override
	public String createCoach(Teachers coach) {
		//method creating new coach
				String message = null;
				coachRepository.save(coach);  //saving coach to database
				if(coach!=null) {
					message = "New Coach is assign to Team ..";
				}
				return message;
	} //end of method
	

	@Override
	public TeachersDto updateCoach(int id, Teachers coach) {
		//method for updating coach
		Teachers getCoach = coachRepository.findById(id).orElseThrow(()-> new TeachersNotFoundException("Coach","ID",id));
		getCoach.setTeachers_name(coach.getTeachers_name());
		getCoach.setCity(coach.getCity());
		getCoach.setCountry(coach.getCountry());
		getCoach.setPhone_no(coach.getPhone_no());;
		coachRepository.save(getCoach); //saving coach to database
			return coachConvertor.convertCoachEntityToCoachDto(getCoach);
	} //end of method

	

	@Override
	public TeachersDto getCoachById(int id) {
		//method for getting coach details by Id
				Teachers coach = coachRepository.findById(id).orElseThrow(()-> new TeachersNotFoundException("Coach","ID",id));
				return coachConvertor.convertCoachEntityToCoachDto(coach);
	}
	

	@Override
	public List<TeachersDto> getAllCoaches() {
		//method for showing all coaches
		List<Teachers> coachList =coachRepository.findAll();
		List<TeachersDto> coachDto = new ArrayList<>();
		for(Teachers b: coachList) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}
	

	@Override
	public String deleteCoachById(int id) {
		//method for delete coach by id
				String message=null;
				Optional<Teachers> coach=coachRepository.findById(id);
				if(coach.isPresent()) {
					
					coachRepository.deleteById(id);
					message = "Coach Delteted  Successfully....";
				}
				else {
					message = "Coach Details are not found........";
				}
				return message;
	}

	@Override
	public void deleteAllCoaches() {
		//method for removing all Coach from dataabses
		coachRepository.deleteAll();
		
	}

	@Override
	public List<TeachersDto> getCoachByCoach_name(String coach_name) {
		List<Teachers> coach = coachRepository.getCoachByCoach_name(coach_name);
		List<TeachersDto> coachDto = new ArrayList<>();
		for(Teachers b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}

	@Override
	public List<TeachersDto> getCoachByPhone_no(long phone_no) {
		List<Teachers> coach = coachRepository.getCoachByPhone_no(phone_no);
		List<TeachersDto> coachDto = new ArrayList<>();
		for(Teachers b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
		
	}

	@Override
	public List<TeachersDto> getCoachByCity(String city) {
		List<Teachers> coach = coachRepository.getCoachByCity(city);
		List<TeachersDto> coachDto = new ArrayList<>();
		for(Teachers b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}

}
