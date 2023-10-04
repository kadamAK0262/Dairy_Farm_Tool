package com.dairy.farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.Society;
import com.dairy.farm.repository.SocietyRepo;

@Service
public class SocietyService {
	
	@Autowired
	private SocietyRepo societyRepo;
	

	public Society addSociety(Society society) {
		return societyRepo.save(society);
	}
		
	 public List<Society> getAllSociety(){
		return societyRepo.findAll();	
		}
		
	}

