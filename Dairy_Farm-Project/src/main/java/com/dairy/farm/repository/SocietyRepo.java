package com.dairy.farm.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.farm.model.Society;

@Repository
public interface SocietyRepo extends JpaRepository<Society, Integer>{
	Society findBySocietyId(long SocietyId);

	List<Costumer> findByIdOfSociety(long idOfSociety);
	
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.farm.model.Societies;

@Repository
public interface SocietyRepo extends JpaRepository<Societies, Long> {

	Societies findBySocietyId(long SocietyId);
	

>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618
}
