package com.akshay.spring.springcoreadvanced.autowiring;

public class Employee {
	// constructor initialization
	private Address address;

	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
