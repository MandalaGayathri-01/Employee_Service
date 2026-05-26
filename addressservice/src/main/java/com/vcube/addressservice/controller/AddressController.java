package com.vcube.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.addressservice.model.Address;
import com.vcube.addressservice.service.AddressService;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@GetMapping("/getAdd/{id}")
	Address getAddressDetails(@PathVariable Integer id) {
		return addressService.getAddressDetails(id);
	}
}
