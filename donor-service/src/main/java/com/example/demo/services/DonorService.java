package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.repos.DonorRepository;

@Service
public class DonorService {

	@Autowired
	public DonorRepository repo;
	
	
	
    public List<Donor> findAll(){
		return this.repo.findAll();
	}
    
    public Optional<Donor> findById(int id) {
		
		return this.repo.findById(id);
	}
    
   
    public List<Donor> findByBloodGroup(String bloodGroup) {
    	  
    	 return this.repo.findByBloodGroup(bloodGroup);
      }

    public List<Donor> findByCity(String city) {
    	  
    	 return this.repo.findByCity(city);
      }

    public Donor addDonor(Donor entity){	
    	
		return this.repo.save(entity);
	}
    
    public Donor updateDonor(Donor donor) {
    	return this.addDonor(donor);
    }
    
   
    public List<Donor> findEligibleDonors(){
		return this.repo.findEligible();
	}
    
   
    public Optional<Donor>  removeDonor(Donor entity) {	  
    	  Donor donor = null; 
    	   if(this.repo.existsById(entity.getId())) {   
    		   this.repo.delete(entity);   
    		   donor = entity;
    	   } 
    	  Optional<Donor> optional = Optional.of(donor);  
    	   return optional;
      }
}
