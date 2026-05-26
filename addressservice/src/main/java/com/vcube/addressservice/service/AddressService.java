package com.vcube.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.addressservice.model.Address;
import com.vcube.addressservice.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepo;
	
	public Address getAddressDetails(Integer id) {
		
		return addressRepo.findById(id).orElseThrow();
	}

}
