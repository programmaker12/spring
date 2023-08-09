package com.tns.springautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;
	
	public Human()
	{
		this.heart = heart;
	}
	public Human(Heart heart)
	{
		this.heart = heart;
	}
	@Autowired
	@Qualifier("octopusHeart")
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPumping()
	{
		heart.pump();
		
		System.out.println("The name of the animal is"+heart.getNameofanimal()+" and number of heart/hearts is/are : "+heart.getNumberofheart());
	}

}
