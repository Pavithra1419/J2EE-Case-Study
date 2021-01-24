package com.example.demo.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="donor_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	int id;
	String name;
	long phoneNum;
	LocalDate dob;
	String address;
	String city;
	String email;
	String bloodGroup;
	public Donor(String name, long phoneNum, LocalDate dob, String address, String city, String email,
			String bloodGroup) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.email = email;
		this.bloodGroup = bloodGroup;
	}
	
	

}
