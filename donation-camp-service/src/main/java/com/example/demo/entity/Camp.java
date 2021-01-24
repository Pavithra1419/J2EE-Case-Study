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
@Table(name="donation_camp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Camp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	int id;
	String name;
	LocalDate campDate;
	String city;
	
	public Camp(String name, LocalDate campDate, String city) {
		super();
		this.name = name;
		this.campDate = campDate;
		this.city = city;
	}
	

}
