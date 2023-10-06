package com.dairy.farm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.dairy.farm.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	@Query(value=" select * from costumer where socity_id=:id ", nativeQuery = true)
	List<Customer> findCustomerBySocityId(@Param(value="id") Integer societyId);
	
	@Query(value = "select  count(socity_id) from costumer group by socity_id", nativeQuery = true)
	List<Integer> countOfCustomer();
}

