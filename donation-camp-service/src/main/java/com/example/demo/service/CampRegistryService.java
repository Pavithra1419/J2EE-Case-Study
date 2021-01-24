package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CampRegistry;
import com.example.demo.repos.CampRegistryRepository;

@Service
public class CampRegistryService {
	@Autowired
	private CampRegistryRepository repo;
	
	
    public List<CampRegistry> findAll(){
		return this.repo.findAll();
	}
    
   
    public CampRegistry addRegistry(CampRegistry entity){	
    	
		return this.repo.save(entity);
	}
	
    
    public List<CampRegistry> findByCampId(int id){
    	return this.repo.findByCampId(id);
    }
}
