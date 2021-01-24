package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Donor;

@CrossOrigin(origins="*")
@Controller
public class ClientController {
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private Donor donor;
	
	
	@GetMapping(path="/")
	public ModelAndView init() {
		mdlView.setViewName("home");
		return mdlView;
		}
	
	
	@GetMapping(path="/getDonors/")
	public ModelAndView allDonors() {
		mdlView.setViewName("allDonors");
		
		return mdlView;		
	}
	
	@GetMapping(path="/getAllCamps/")
	public ModelAndView getCamps() {
		mdlView.setViewName("allCamps");
		
		return mdlView;		
	}
	@GetMapping(path="/register/")
	public ModelAndView addDonor() {
		mdlView.setViewName("addDonor");
		
		return mdlView;		
	}
	@GetMapping(path="/searchBlood/")
	public ModelAndView searchBlood() {
		mdlView.setViewName("searchBlood");
		
		return mdlView;		
	}
	@GetMapping(path="/account/")
	public ModelAndView changeAccount() {
		mdlView.setViewName("account");
		
		return mdlView;		
	}
	
}
