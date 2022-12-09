package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="student_details")
public class Student {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="student_name")
		private String studentName;
		
		@Column(name="student_phone")
		private long phone;
		
		@Column(name="student_email")
		private String email;
		
		
}
