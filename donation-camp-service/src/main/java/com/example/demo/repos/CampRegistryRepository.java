package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CampRegistry;

public interface CampRegistryRepository extends JpaRepository<CampRegistry, Integer> {
	List<CampRegistry> findByCampId(int id);
}
