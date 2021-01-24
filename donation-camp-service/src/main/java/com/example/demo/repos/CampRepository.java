package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Camp;


@Repository
public interface CampRepository extends JpaRepository<Camp, Integer> {
	
		List<Camp> findByCity(String city);
		
	
		List<Camp> findByName(String name);
}
