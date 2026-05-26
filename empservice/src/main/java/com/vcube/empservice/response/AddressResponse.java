package com.vcube.empservice.response;

import lombok.Data;

@Data
public class AddressResponse {
	
	String flat;
	String plot;
	String street;
	String city;
	String state;
	String country;
	Long pincode;

}
