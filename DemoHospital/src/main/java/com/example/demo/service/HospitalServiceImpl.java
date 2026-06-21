package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hospital;
import com.example.demo.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	 private HospitalRepository sr;
	@Override
	public void add(Hospital s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Hospital> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
