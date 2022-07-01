package com.akshay.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext
				(" com/akshay/spring/springcore/dependencycheck/config.xml");
		
		Prescription pres = (Prescription) context.getBean("prescription");
		System.out.println(pres); // calls toString method
		
	}

}
