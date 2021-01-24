package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Donor;

import com.example.demo.repos.DonorRepository;


@SpringBootApplication
public class DonorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonorServiceApplication.class, args);
	}
	
}
