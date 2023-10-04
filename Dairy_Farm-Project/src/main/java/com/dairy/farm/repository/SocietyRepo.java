package com.dairy.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.farm.model.Society;

@Repository
public interface SocietyRepo extends JpaRepository<Society, Integer>{
	Society findBySocietyId(long SocietyId);

}
