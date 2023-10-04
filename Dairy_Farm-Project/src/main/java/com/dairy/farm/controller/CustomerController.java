package com.dairy.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.Customer;
import com.dairy.farm.service.CustomerService;

import jakarta.validation.constraints.AssertTrue.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService serve;
	
	@GetMapping("/getCostumer")
	public java.util.List<Customer> getCost(){
		return serve.getCostumer();
	}
	
	@PostMapping("/addCostumer")
	public Customer addCost(@RequestBody Customer costumer) {
		return serve.addCostumer(costumer);
	}
	
	@GetMapping("/getDataBySocietyId/{societyId}")
	public java.util.List<Customer> getCustomerBySocietyId(@PathVariable int societyId){
		 return serve.findCustomerBySocietyIdService(societyId);
	}
	
	@GetMapping("/count")
	public java.util.List<Integer> getCountOfCustomer() {
		return serve.findCountOfCustomer();
	}
	
	
}
