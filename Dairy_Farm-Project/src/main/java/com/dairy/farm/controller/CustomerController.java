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

import com.dairy.farm.model.Customer;
import com.dairy.farm.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
<<<<<<< HEAD:Dairy_Farm-Project/src/main/java/com/dairy/farm/controller/CustomerController.java
	private CustomerService serve;
	
	@GetMapping("/getCostumer")
	public java.util.List<Customer> getCost(){
=======
	private CostumerService serve;

	@GetMapping("/getCostumer")
	public List<Costumer> getCostumer() {
>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618:Dairy_Farm-Project/src/main/java/com/dairy/farm/controller/CostumerController.java
		return serve.getCostumer();
	}

	@PostMapping("/addCostumer")
<<<<<<< HEAD:Dairy_Farm-Project/src/main/java/com/dairy/farm/controller/CustomerController.java
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
	
	
=======
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

>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618:Dairy_Farm-Project/src/main/java/com/dairy/farm/controller/CostumerController.java
}
