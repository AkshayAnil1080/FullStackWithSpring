package com.akshay.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcoreadvanced/stereotype/annotations/config.xml");

		// it generates the bean name as same class name in Camel case
		Instructor instructor = (Instructor) context.getBean("inst");

		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) context.getBean("inst");

		System.out.println(instructor2);

	}
}
