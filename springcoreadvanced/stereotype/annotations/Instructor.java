package com.akshay.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")

public class Instructor {
//	@Value("#{66+44}")
//	@Value("#{T(java.lang.Math).abs(-99)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id=10;
	
//	@Value("#{'Akshay Anil'.toUpperCase()}")
	@Value("#{new.java.lang.String('Akshay Anil')}")
	String name="who";
	
	@Value("#{2+4>5}")
	private boolean active;

	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;  // 1. ctrl 1+ make class
	

	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
