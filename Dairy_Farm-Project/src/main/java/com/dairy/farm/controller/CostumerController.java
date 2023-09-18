package com.dairy.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.Costumer;
import com.dairy.farm.service.CostumerService;

import jakarta.validation.constraints.AssertTrue.List;

@RestController
@RequestMapping("/api")
public class CostumerController {

	@Autowired
	private CostumerService serve;
	
	@GetMapping("/getCostumer")
	public java.util.List<Costumer> getCost(){
		return serve.getCostumer();
	}
	
	@PostMapping("/addCostumer")
	public Costumer addCost(@RequestBody Costumer costumer) {
		return serve.addCostumer(costumer);
	}
	
	
}
