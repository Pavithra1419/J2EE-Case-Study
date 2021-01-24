package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Camp;
import com.example.demo.entity.CampRegistry;
import com.example.demo.entity.Donor;
import com.example.demo.entity.LastDonatedList;

@SpringBootApplication
public class BloodBankClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankClientApplication.class, args);
	}
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
		
	}
	
	@Bean
	public ModelAndView modelAndView() {
		
		return new ModelAndView();
		
	}
	
	@Bean
	public Donor donor() {
		return new Donor();
	}
	
	@Bean
	public Camp donorCamp() {
		return new Camp();
	}
	
	@Bean
	public CampRegistry donorRegistry() {
		return new CampRegistry();
	}
	
	@Bean
	public LastDonatedList lastDonated() {
		return new LastDonatedList();
	}
	
	
}
