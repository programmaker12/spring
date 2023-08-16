package com.tns.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	
	private static ApplicationContext a;

	public static void main(String [] args) {
		a = new ClassPathXmlApplicationContext("beans.xml");
		Human human = a.getBean("human", Human.class);
		human.startPumping();
		
	}

}
