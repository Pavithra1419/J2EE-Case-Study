package com.example.demo.entity;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LastDonatedList {

	int id;
	LocalDate lastDonated;

}
