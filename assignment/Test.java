package com.akshay.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext
				(" com/akshay/spring/springcore/assignment/itemconfig.xml");
		
		ShoppingCart cart = (ShoppingCart) context.getBean("item");
		System.out.println("Id is "+ cart.getId());
		System.out.println("Name is " + cart.getName());
		System.out.println("Price is " + cart.getPrice());
		System.out.println("Quantity is " + cart.getQuantity());
		
	
	}

}
