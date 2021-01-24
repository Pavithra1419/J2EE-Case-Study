package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LastDonatedList;
import com.example.demo.repos.LastDonatedListRepo;

@Service
public class LastDonatedService {

	
	@Autowired
	private LastDonatedListRepo repo;
	
    
	
	public List<LastDonatedList> findAllDonatedDates(){
		return this.repo.findAll();
	}
	
	//add or update a entry of LastDonated tabe
    public LastDonatedList addUpdateDonatedDate(LastDonatedList entity){	
    	
		return this.repo.save(entity);
	}
}
