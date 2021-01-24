package com.example.demo.entity;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Camp {
	
	
	int id;
	String name;
	LocalDate campDate;
	String city;
	
	
	

}
