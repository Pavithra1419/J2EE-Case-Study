package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Camp;
import com.example.demo.service.CampService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/campservice")
public class CampController {
   @Autowired
   private CampService service;
   
   
   @GetMapping(path="/")
   public List<Camp> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping(path="/add")
	
	public Camp addCamp(@RequestBody Camp entity) {
		return this.service.addCamp(entity);
	}
	
	@GetMapping(path ="/find/{id}")
   public ResponseEntity<Camp> findById(@PathVariable int id){
		
		Camp resp =this.service.findById(id).orElseThrow( () -> new RuntimeException("ID Not Found"));
		
		 return ResponseEntity.ok().body(resp);
			
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(path ="/findCity/{city}")
    public List<Camp> findByCity(@PathVariable String city){
		return this.service.findByCity(city);	
	}
	
	/*@GetMapping(path ="/find/{name}")
    public List<Camp> findByName(@PathVariable String name){
		return this.service.findByName(name);	
	}*/

      
	
}
