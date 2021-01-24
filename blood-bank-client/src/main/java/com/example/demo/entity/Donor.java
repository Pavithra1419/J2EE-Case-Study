package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor {
	
	int id;
	String name;
	long phoneNum;
	LocalDate dob;
	String address;
	String city;
	String email;
	String bloodGroup;

}
