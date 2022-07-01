package com.akshay.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	
	private int id;
	private String patientname;
	private  List<String> medicine;
	
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientname() {
		return patientname;
	}
	@Override
	public String toString() {
		return "prescription [id=" + id + ", patientname=" + patientname + ", medicine=" + medicine + "]";
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public List<String> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}
	
}
