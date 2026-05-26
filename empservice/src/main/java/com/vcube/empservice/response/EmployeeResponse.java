package com.vcube.empservice.response;

import lombok.Data;

@Data
public class EmployeeResponse {
	
	Integer eid;
	String fname;
	String lname;
	Double salary;
	Integer age;
	Long phone;
	
	AddressResponse addressResponse;

}
