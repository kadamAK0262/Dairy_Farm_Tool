package com.dairy.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.Costumer;
import com.dairy.farm.service.CostumerService;

@RestController
@RequestMapping("/api")
public class CostumerController {

	@Autowired
	private CostumerService serve;

	@GetMapping("/getCostumer")
	public List<Costumer> getCostumer() {
		return serve.getCostumer();
	}

	@PostMapping("/addCostumer")
	public Costumer addCost(@RequestBody Costumer costumer) {
		return serve.addCustomer(costumer);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		serve.deleteCustomer(id);
	}

	@GetMapping("/customersBySocietyId/{idOfSociey}")
	public List<Costumer> getCustomersSocietyId(@PathVariable long idOfSociey) {
		List<Costumer> customers = serve.getCustomerBySocietyId(idOfSociey);
		return (customers);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Costumer> updateCustomer(@PathVariable int id, @RequestBody Costumer updatedCustomer) {
		return serve.updateCustomer(id, updatedCustomer);

	}

}
