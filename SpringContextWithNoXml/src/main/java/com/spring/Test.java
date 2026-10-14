package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mul.Airtel;
import com.mul.SimTest;


public class Test {

	public static void main(String[] args) {


		ApplicationContext container = new AnnotationConfigApplicationContext(Configs.class);
		 
		
		SimTest simTest = container.getBean("simTest" , SimTest.class);
		
		simTest.test();
		
		Airtel airtel = container.getBean("airtel" , Airtel.class);
		Airtel airtel2 = container.getBean("airtel" , Airtel.class);
		
		System.out.println(airtel.hashCode());
		System.out.println(airtel2.hashCode());
        

	}

	private static void addUser(ApplicationContext container) {
		
		User user = container.getBean("user" , User.class);
		
		System.out.println(user);
	}

	
}
