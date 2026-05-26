package com.vcube.addressservice.model;


//http://localhost:8082/api/v1/address/getAdd/1


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String flat;
	String plot;
	String street;
	String city;
	String state;
	String country;
	Long pincode;
}
