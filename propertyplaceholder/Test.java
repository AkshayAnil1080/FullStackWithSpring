package com.akshay.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshay.spring.springcore.innerbeans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);
	}

}
