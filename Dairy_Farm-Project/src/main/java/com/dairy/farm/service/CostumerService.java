package com.dairy.farm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.Costumer;
import com.dairy.farm.repository.CostumerRepo;



@Service
public class CostumerService {

	@Autowired
	private CostumerRepo repo;
	
	public Costumer addCostumer(Costumer costumer) {
		return repo.save(costumer);
	}
	
	public java.util.List<Costumer> getCostumer() {
	    return repo.findAll();
	}

	
}
