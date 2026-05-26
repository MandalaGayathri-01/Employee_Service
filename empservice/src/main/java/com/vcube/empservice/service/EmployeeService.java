package com.vcube.empservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.vcube.empservice.model.Employee;
import com.vcube.empservice.repository.EmployeeRepository;
import com.vcube.empservice.response.AddressResponse;
import com.vcube.empservice.response.EmployeeResponse;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	WebClient webClient;

	public EmployeeResponse getEmpDetails(Integer eid) {
		Employee emp = empRepo.findById(eid).orElseThrow();
		
		EmployeeResponse empresponse=modelMapper.map(emp, EmployeeResponse.class);
		
		//using resttemplate
//		AddressResponse addressResponse=restTemplate.getForObject("http://localhost:8082/api/v1/address/getAdd/{eid}", AddressResponse.class, eid );
//		empresponse.setAddressResponse(addressResponse);
//		
		//WebClient
		// WebClient
		WebClient webClient = WebClient.create("http://localhost:8082");

		AddressResponse addressResponse = webClient.get()
		        .uri("/api/v1/address/getAdd/{eid}", eid)
		        .retrieve()
		        .bodyToMono(AddressResponse.class)
		        .block();

		empresponse.setAddressResponse(addressResponse);

		return empresponse;

	}

}
