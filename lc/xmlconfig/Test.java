package com.akshay.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcore/lc/xmlconfig/config.xml");
		Patient pat = (Patient) context.getBean("patient");
		System.out.println(pat); // calls toString method
		
		// need declarer pre shut which is done by AbstractApplicationContext
		
		context.registerShutdownHook(); 
	}

}
