package com.dairy.farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.dairy.farm.model.Society;
=======
import com.dairy.farm.model.Societies;
>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618
import com.dairy.farm.repository.SocietyRepo;

@Service
public class SocietyService {
<<<<<<< HEAD
	
	@Autowired
	private SocietyRepo societyRepo;
	

	public Society addSociety(Society society) {
		return societyRepo.save(society);
	}
		
	 public List<Society> getAllSociety(){
		return societyRepo.findAll();	
		}
		
	}

=======

	@Autowired
	private SocietyRepo societyRepo;

	public Societies addSociety(Societies society) {
		return societyRepo.save(society);
	}

	public List<Societies> getSociety() {
		return societyRepo.findAll();
	}

	public Societies updateSociety(Societies society, long id) {
		Societies societies = societyRepo.findById(id).get();

		societies.setSocietyName(society.getSocietyName());
		societies.setSocietyId(society.getSocietyId());
		societies.setTotalActiveCustomers(society.getTotalActiveCustomers());

		return societyRepo.saveAndFlush(societies);

	}

	public void deleteSociety(long id) {
		societyRepo.deleteById(id);
	}

}
>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618
