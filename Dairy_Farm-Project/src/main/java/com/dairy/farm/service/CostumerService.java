package com.dairy.farm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dairy.farm.model.Costumer;
import com.dairy.farm.model.Societies;
import com.dairy.farm.repository.CostumerRepo;
import com.dairy.farm.repository.SocietyRepo;

@Service
public class CostumerService {

	@Autowired
	private CostumerRepo repo;

	@Autowired
	private SocietyRepo societyRepo;

	public java.util.List<Costumer> getCostumer() {
		return repo.findAll();
	}

	public Costumer addCustomer(Costumer customer) {
		Costumer savedCustomer = repo.save(customer);
		updateTotalActiveCustomers(savedCustomer);
		return savedCustomer;
	}

	private void updateTotalActiveCustomers(Costumer customer) {
		long idOfSociety = customer.getIdOfSociety();
		if (idOfSociety > 0) {
			try {
				Societies societyEntity = societyRepo.findBySocietyId(idOfSociety);
				if (societyEntity != null) {
					societyEntity.setTotalActiveCustomers(societyEntity.getTotalActiveCustomers() + 1);
					societyRepo.save(societyEntity);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteCustomer(int id) {
		Costumer customerDelete = repo.findById(id).orElse(null);
		if (customerDelete != null) {
			repo.deleteById(id);
			deleteTotalActiveCustomers(customerDelete);
		}
	}

	private void deleteTotalActiveCustomers(Costumer customer) {
		long idOfSociety = customer.getIdOfSociety();

		if (idOfSociety > 0) {
			try {
				Societies society = societyRepo.findBySocietyId(idOfSociety);
				if (society != null) {
					long currentTotalCustomers = society.getTotalActiveCustomers();
					if (currentTotalCustomers > 0) {
						society.setTotalActiveCustomers(currentTotalCustomers - 1);
						societyRepo.save(society);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Costumer> getCustomerBySocietyId(long idOfSociety) {
		return repo.findByIdOfSociety(idOfSociety);
	}

	public ResponseEntity<Costumer> updateCustomer(int id, Costumer updatedCustomer) {
		Optional<Costumer> existingCustomer = repo.findById(id);
		if (existingCustomer.isPresent()) {
			Costumer customer = existingCustomer.get();

			long oldSocietyId = customer.getIdOfSociety(); // Get the old society ID

			customer.setCostumerName(updatedCustomer.getCostumerName());
			customer.setContactNo(updatedCustomer.getContactNo());
			customer.setEmailId(updatedCustomer.getEmailId());
			customer.setAddress(updatedCustomer.getAddress());
			customer.setMilkType(updatedCustomer.getMilkType());
			customer.setQuantity(updatedCustomer.getQuantity());
			long newSocietyId = updatedCustomer.getIdOfSociety(); // Get the new society ID
			customer.setIdOfSociety(newSocietyId);

			Costumer updatedCostumer = repo.saveAndFlush(customer);

			if (oldSocietyId > 0) {
				decrementTotalActiveCustomers(oldSocietyId);
			}

			if (newSocietyId > 0) {
				incrementTotalActiveCustomers(newSocietyId);
			}

			return ResponseEntity.ok(updatedCostumer);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	private void decrementTotalActiveCustomers(long societyId) {
		Societies society = societyRepo.findBySocietyId(societyId);
		if (society != null) {
			long currentTotalCustomers = society.getTotalActiveCustomers();
			if (currentTotalCustomers > 0) {
				society.setTotalActiveCustomers(currentTotalCustomers - 1);
				societyRepo.save(society);
			}
		}
	}

	private void incrementTotalActiveCustomers(long societyId) {
		Societies society = societyRepo.findBySocietyId(societyId);
		if (society != null) {
			society.setTotalActiveCustomers(society.getTotalActiveCustomers() + 1);
			societyRepo.save(society);
		}
	}

}
