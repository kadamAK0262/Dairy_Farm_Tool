package com.dairy.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	}

}
