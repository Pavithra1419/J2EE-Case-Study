package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LastDonatedList;
import com.example.demo.services.LastDonatedService;

@RestController
@RequestMapping(path="/last")
public class LastDonatedController {
	@Autowired
	private LastDonatedService service;
	
	@GetMapping(path="/")
	public List<LastDonatedList> findAll(){
		return this.service.findAllDonatedDates();
	}
	
	@PostMapping(path="/")
    public LastDonatedList addEnter(@RequestBody LastDonatedList entity) {
		return this.service.addUpdateDonatedDate(entity);
	}
}
