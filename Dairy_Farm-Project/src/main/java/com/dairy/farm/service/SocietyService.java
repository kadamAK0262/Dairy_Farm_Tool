package com.dairy.farm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.Societies;
import com.dairy.farm.repository.SocietyRepo;

@Service
public class SocietyService {

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
