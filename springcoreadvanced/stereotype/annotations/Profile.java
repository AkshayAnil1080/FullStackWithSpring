package com.akshay.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   // want to creaete ab obj of it
public class Profile {
	@Value("SDE PPE at brillio")
	private String title;
	
	@Value("BRILLIO TECH")
	private String company;
	
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
