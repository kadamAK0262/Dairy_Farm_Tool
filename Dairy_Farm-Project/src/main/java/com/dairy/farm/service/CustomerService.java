package com.dairy.farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.Customer;
import com.dairy.farm.model.Society;
import com.dairy.farm.repository.CustomerRepo;
import com.dairy.farm.repository.SocietyRepo;



@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	
	@Autowired
	private SocietyRepo societyRepo;
	
	
	public Customer addCostumer(Customer customer) {
//		return repo.save(customer);
		Customer savedCustomer = repo.save(customer);
		updateTotalActiveCustomers(savedCustomer);
		return savedCustomer;
		
		
	}
	
	private void updateTotalActiveCustomers(Customer customer) {
		long idOfSociety = customer.getIdOfSociety();
        if (idOfSociety > 0) {
            try {
                Society societyEntity = societyRepo.findBySocietyId(idOfSociety);
                if (societyEntity != null) {
                    societyEntity.setTotalActiveCustomer(societyEntity.getTotalActiveCustomer() + 1);
                    societyRepo.save(societyEntity);
                }
            } catch (Exception e) {
                // Handle the exception gracefully, e.g., log the error
                e.printStackTrace(); // Replace with appropriate error handling
            }
        }
		
	}

	public java.util.List<Customer> getCostumer() {
	    return repo.findAll();
	}

	public List<Customer> findCustomerBySocietyIdService(int id){
		return repo.findCustomerBySocityId(id);
	}
	
	
	public List<Integer> findCountOfCustomer() {
		return repo.countOfCustomer();
	}
}
