package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hospital;
import com.example.demo.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService ss;
	
	@GetMapping("/display")
	public List<Hospital>displayHospitals(){
		return ss.display();
	}
	
	@PostMapping("/add")
	public void addHospital(Hospital s) {
		ss.add(s);
	}

}
