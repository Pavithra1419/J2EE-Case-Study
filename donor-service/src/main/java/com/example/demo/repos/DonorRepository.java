package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Integer> {

	
	List<Donor> findByBloodGroup(String bloodGroup);
	
	List<Donor> findByCity(String city);
	
	@Query(value="select donor.* from donor_service as donor left join last_donated as last on donor.id=last.id where (datediff(CURDATE(),last.lastDonated)>180 or last.lastDonated is null);",nativeQuery=true)
	List<Donor> findEligible();
}
