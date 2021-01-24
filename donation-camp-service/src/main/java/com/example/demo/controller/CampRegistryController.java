package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CampRegistry;
import com.example.demo.service.CampRegistryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/campregistry")

public class CampRegistryController {
	@Autowired
	private CampRegistryService service;
	
	@GetMapping(path="/")
	
	public List<CampRegistry> findAll(){
		return this.service.findAll();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(path="/{id}")
	
	public List<CampRegistry> findByCampId(@PathVariable int id){
		return this.service.findByCampId(id);
	}
	
	@PostMapping(path="/")
	
	public CampRegistry addEntry(@RequestBody CampRegistry entity) {
		return this.service.addRegistry(entity);
	}

}
