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
@Entity
@ToString
@Table(name="college")
public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int college_id;
	
	@NotNull(message="Sport name is required")
	private String teachers_name;
	
	@NotNull(message="Team name is required")
	private String college_name;
	
	@NotNull(message="City name is required")
	private String city;
	
	@NotNull(message="Country name is required")
	private String country;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="coach_id")
	private Teachers coach;
	
	@Builder
	public College( String sport_name,String team_name, String city,String country) {
		super();
		this.college_name = sport_name;
		this.teachers_name = team_name;
		this.city = city;
		this.country = country;
	}
	
	
	
}