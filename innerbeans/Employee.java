package com.akshay.spring.springcore.innerbeans;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;

}
