package com.akshay.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	
	public void hi() {  //init
		System.out.println("Inside Hi Method");
	}
	public void bye() {  //destroy
		System.out.println("inside Bye Method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
