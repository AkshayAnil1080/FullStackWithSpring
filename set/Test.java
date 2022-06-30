package com.akshay.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshay.spring.springcore.list.Hospital;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(" com/akshay/spring/springcore/set/setconfig.xml");
		CarDealer cardealer =  (CarDealer) context.getBean("cardealer"); // use id  given to class b to be injected
		 System.out.println(cardealer.getName());
		 System.out.println(cardealer.getModels());
	}

}
