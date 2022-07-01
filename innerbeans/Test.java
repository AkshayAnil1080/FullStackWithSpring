package com.akshay.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/innerbeans/config.xml");
		
		Employee  employee1 = (Employee) context.getBean("employee");
		System.out.println(employee1.hashCode());
		
		Employee  employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2.hashCode());

	}

}
