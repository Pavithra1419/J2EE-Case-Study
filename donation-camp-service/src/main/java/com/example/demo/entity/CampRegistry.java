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
@Table(name="camp_registry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampRegistry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int slno;
	
	private int campId;
	private int donorId;
	public CampRegistry(int campId, int donorId) {
		super();
		this.campId = campId;
		this.donorId = donorId;
	}
}
