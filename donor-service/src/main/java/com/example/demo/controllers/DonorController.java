
package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Donor;

import com.example.demo.services.DonorService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/donors")
public class DonorController {
	@Autowired
	private DonorService service;
	
	@CrossOrigin(origins="*")
	@PostMapping(path="/add")
	@ResponseStatus(value=HttpStatus.CREATED)
	public Donor addDonor(@RequestBody Donor entity) {
		return this.service.addDonor(entity);
	}
	@CrossOrigin(origins="*")
	@PutMapping(path ="/update")
	public int update(@RequestBody Donor entity) {
		Optional<Donor> upd=this.service.findById(entity.getId());
		if(upd.isPresent()) {
			this.service.updateDonor(entity);
			return 1;
		}
		else
			return 0;
	}
	
	@GetMapping(path="/")
	public List<Donor> findAll(){
		return this.service.findAll();
	}
	
	
	@GetMapping(path ="/find/{id}")
   public Optional<Donor> findById(@PathVariable int id){
		
          return this.service.findById(id); //.orElseThrow( () -> new RuntimeException("ID Not Found"));
		
		 //return ResponseEntity.ok().body(resp);
			
	}
	
	@GetMapping(path ="/findGroup/{group}")
	public List<Donor> findByBloodGroup(@PathVariable String group){
		
		return this.service.findByBloodGroup(group);
		
	}
	@GetMapping(path ="/findLoc/{city}")
	public List<Donor> findByCity(@PathVariable String city){
		
		return this.service.findByCity(city);
		
	}
	
	
	
	@GetMapping(path ="/eligible")
	public List<Donor> findEligible(){
		return this.service.findEligibleDonors();
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public Optional<Donor> removeDonor(@PathVariable int id) {	
		Donor resp =this.service.findById(id).orElseThrow( () -> new RuntimeException("ID Not Found"));		
		 return this.service.removeDonor(resp);
	}

}
