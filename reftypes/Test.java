package com.akshay.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcore/reftypes/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
