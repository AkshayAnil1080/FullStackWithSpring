package com.akshay.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/akshay/spring/springcore/constructorinjection/config.xml");
		
 Employee e =(Employee) context.getBean("employee");
 System.out.println(e);
	

}
}
