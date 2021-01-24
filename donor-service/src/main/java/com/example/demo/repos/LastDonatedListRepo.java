package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LastDonatedList;

@Repository
public interface LastDonatedListRepo extends JpaRepository<LastDonatedList, Integer> {

	
	
}
