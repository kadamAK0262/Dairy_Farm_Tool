package com.dairy.farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.DaliyCustomer;
import com.dairy.farm.repository.DailyCustomerRepo;

@Service
public class DailyCustomerService {

	@Autowired
    private DailyCustomerRepo dailyCustomerRepository;

    public List<DaliyCustomer> getAllDailyCustomers() {
        return dailyCustomerRepository.findAll();
    }

    public DaliyCustomer getDailyCustomerById(int id) {
        return dailyCustomerRepository.findById(id).orElse(null);
    }

    public DaliyCustomer updateDailyCustomer(DaliyCustomer dailyCustomer) {
        return dailyCustomerRepository.save(dailyCustomer);
    }

    public void deleteDailyCustomer(int id) {
        dailyCustomerRepository.deleteById(id);
    }
	
    public List<DaliyCustomer> getBySocietyId(int societyId) {
    	return dailyCustomerRepository.findByIdOfSociety(societyId);
    }
	
}
