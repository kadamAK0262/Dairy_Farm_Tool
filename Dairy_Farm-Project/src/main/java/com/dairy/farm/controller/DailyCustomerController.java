package com.dairy.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.DaliyCustomer;
import com.dairy.farm.service.DailyCustomerService;

@RestController
@RequestMapping("/dailyCustomers")
public class DailyCustomerController {
	
	@Autowired
    private DailyCustomerService dailyCustomerService;

    @GetMapping("/")
    public List<DaliyCustomer> getAllDailyCustomers() {
        return dailyCustomerService.getAllDailyCustomers();
    }

    @GetMapping("/{id}")
    public DaliyCustomer getDailyCustomerById(@PathVariable int id) {
        return dailyCustomerService.getDailyCustomerById(id);
    }

    @PutMapping("/{id}")
    public DaliyCustomer updateDailyCustomer(@PathVariable int id, @RequestBody DaliyCustomer dailyCustomer) {
        dailyCustomer.setId(id);
        return dailyCustomerService.updateDailyCustomer(dailyCustomer);
    }

    @DeleteMapping("/{id}")
    public void deleteDailyCustomer(@PathVariable int id) {
        dailyCustomerService.deleteDailyCustomer(id);
    }
    
    
    @GetMapping("/societyId/{societyId}")
    public List<DaliyCustomer> getBySociety(@PathVariable int societyId){
    	return dailyCustomerService.getBySocietyId(societyId);
    }
    

}
