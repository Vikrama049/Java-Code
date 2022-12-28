package com.sports.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="teachers")

public class Teachers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int teachers_id;
	
	@NotNull(message="Coach name is Required")
	private String teachers_name;
	
	@NotNull(message="phone no is required")
	private long phone_no;
	
	@NotNull(message="City name is required")
	private String city;
	
	@NotNull(message="Country name is required")
	private String country;
	
	@Builder
	public Teachers( String coach_name, long phone_no, String city,String country) {
		super();
		this.teachers_name = coach_name;
		this.phone_no = phone_no;
		this.city = city;
		this.country = country;
	}

	
	
}
