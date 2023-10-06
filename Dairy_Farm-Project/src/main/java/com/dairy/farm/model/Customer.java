package com.dairy.farm.model;

import java.sql.Date;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;

import com.dairy.farm.repository.SocietyRepo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String costumerName;
	
	private long contactNo;
	
	private String emailId;
	
	private String address;
	
	private String milkType;
	
	private long quantity;
	
	@JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
	@Column(name="date")
	private String date;
	
	
	private long idOfSociety;

//	@ManyToOne
//	@JoinColumn(name = "society_id")
//	private Society society;
	
	
//	@Autowired
//	private SocietyRepo societyRepo;
//	
//	public void updateTotalActiveCustomer() {
//		if(society!=null) {
//			Society societyEntity = societyRepo.findById(society.getSocietyId()).orElse(null);
//			if(societyEntity!=null) {
//				societyEntity.setTotalActiveCustomer(societyEntity.getTotalActiveCustomer()+1);
//				societyRepo.save(societyEntity);
//			}
//		}
	
}
	
	
	

