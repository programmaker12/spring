package com.tns.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String [] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("classpath*:beans.xml");
		System.out.println("Configuration...........");
		
		Student s2 = c.getBean("s2", Student.class);
		s2.cheating();
	}

}
