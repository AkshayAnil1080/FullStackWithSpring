package com.akshay.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	// constructor initialization
	
	@Autowired(required=false)
	@Qualifier("address123")
	private Address address;

	// don not int constructor else wont work
	
	public Address getAddress() {
		return address;
	}



	

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}
