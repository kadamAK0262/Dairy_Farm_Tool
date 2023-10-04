package com.dairy.farm.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.farm.model.DaliyCustomer;

@Repository
public interface DailyCustomerRepo extends JpaRepository<DaliyCustomer, Integer> {

	List<DaliyCustomer> findByCheckDate(LocalDate previousDate);

	void deleteByCheckDate(LocalDate previousDate);

	List<DaliyCustomer> findByIdOfSociety(long idOfSociety);
	
}
