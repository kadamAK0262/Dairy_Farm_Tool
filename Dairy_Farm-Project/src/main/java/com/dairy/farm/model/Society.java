package com.dairy.farm.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="Society_table")
@Entity
public class Society {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int societyId;
	
	private String societyName;
	
	private int totalActiveCustomer;

}
