package com.tns.spring.demo;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {
	public static void main (String [] args)
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration file loaded........");
		Sim s = c.getBean("Sim", Airtel.class);
		
		s.calling();
		s.data();
		System.out.println("Configuration file loaded........");
		Sim a = c.getBean("Jio", Jio.class);
		
		a.calling();
		a.data();
		
	}

}
