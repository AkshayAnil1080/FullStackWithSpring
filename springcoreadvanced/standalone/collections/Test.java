package com.akshay.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcoreadvanced/standalone.collections/config.xml");

		ProductsList pl = (ProductsList) context.getBean("productsList");
		System.out.println(pl);

	}
}
