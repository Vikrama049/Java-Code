package ServiceImpTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sports.entity.Teachers;
import com.sports.repository.TeachersRepository;
import com.sports.service.TeachersService;

@SpringBootTest
public class CoachServiceImpTest {

	@Autowired
	private TeachersService coachService;
	@MockBean
	private TeachersRepository coachRepository;
	
	@DisplayName(value = "Create Coach Positive Test")
	@Test
	
	void createCoachTest() {
		
		Teachers coach=new Teachers();
		coach.setCoach_name("Jyoti");
		coach.setCity("Pune");
		coach.setCountry("India");
		coach.setPhone_no(990876743);
		
		Mockito.when(coachRepository.save(coach)).thenReturn(coach);
		assertThat(coachService.createCoach(coach)).isEqualTo("New Coach is assign ..");
	}
	
	@Test
	void getCoach()
	{
		Teachers coach=Teachers.builder().coach_name("Jyoti").city("Pune").country("India").phone_no(990876743).build();
		Mockito.when(coachRepository.save(coach)).thenReturn(coach);
		assertEquals(coach.getCoach_name() ,"Jyoti");
	}
	
}
