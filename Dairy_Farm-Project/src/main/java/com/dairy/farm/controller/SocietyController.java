package com.dairy.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.Society;
import com.dairy.farm.service.SocietyService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class SocietyController {
	
	@Autowired
	private SocietyService societyService;
	
	@PostMapping("/addSociety")
	public Society saveSociety(@RequestBody Society society) {
		return societyService.addSociety(society);
	}
	
	@GetMapping("/getAllSocity")
	public List<Society> getAllSocity(){
		return societyService.getAllSociety();
=======
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.farm.model.Societies;
import com.dairy.farm.service.SocietyService;

@RestController
@RequestMapping("/api")
public class SocietyController {

	@Autowired
	private SocietyService societyserve;

	@PostMapping("/addSociety")
	public Societies addSocieties(@RequestBody Societies society) {
		return societyserve.addSociety(society);
	}

	@GetMapping("/getSocieties")
	public List<Societies> getSocieties() {
		return societyserve.getSociety();
	}

	@PutMapping("/updateSociety/{id}")
	public Societies updateSociety(@PathVariable int id, @RequestBody Societies society) {
		return societyserve.updateSociety(society, id);
	}

	@DeleteMapping("/deleteSociety/{id}")
	public void deleteSociety(long id) {
		societyserve.deleteSociety(id);
>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618
	}

}
