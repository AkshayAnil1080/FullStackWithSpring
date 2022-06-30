package com.akshay.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/properties/config.xml");
		CoutriesAndLanguages countriesAndLangs = (CoutriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);
	}
	

}
