package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Camp;
import com.example.demo.repos.CampRepository;

@Service
public class CampService {

	
	@Autowired
	private CampRepository repo;
	
	
    public List<Camp> findAll(){
		return this.repo.findAll();
	}
    
   
    public Camp addCamp(Camp entity){	
    	
		return this.repo.save(entity);
	}
    public Camp updateCamp(Camp entity){	
    	
  		return this.addCamp(entity);
  	}
  	
public Optional<Camp> findById(int id) {
		
		return this.repo.findById(id);
	}
  
	public List<Camp> findByCity(String city){
		return this.repo.findByCity(city);
	}
	
	
	public List<Camp> findByName(String name){
		return this.repo.findByName(name);
	}
	
	
	
	
}
