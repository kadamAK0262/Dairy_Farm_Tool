package com.dairy.farm.model;

<<<<<<< HEAD:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Costumer.java
import java.time.LocalDate;

=======
import jakarta.annotation.Generated;
>>>>>>> 83cbfc5379f3f2c5ea514d3004828cd1362be0da:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Society.java
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
<<<<<<< HEAD:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Society.java
	private int societyId;
	
	private String societyName;
=======
	private int id;

//	private String costumerName;

	private String customerName;

	private long contactNo;

	private String emailId;

	private String address;

	private String milkType;

	private long quantity;
	
	private long idOfSociety;
	
<<<<<<< HEAD:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Costumer.java
	private int rate;
	
	private int outStandingBill;
	
	private int bill;

    private String delivered;
	
	private LocalDate checkDate;
	
=======
>>>>>>> 1441e328283e576b9ba4c2f32c74d6f30ffc1618:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Costumer.java
>>>>>>> 83cbfc5379f3f2c5ea514d3004828cd1362be0da:Dairy_Farm-Project/src/main/java/com/dairy/farm/model/Society.java
	
	private int totalActiveCustomer;

}
