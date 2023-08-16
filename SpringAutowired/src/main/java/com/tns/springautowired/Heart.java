package com.tns.springautowired;

public class Heart {
	
	private String nameofanimal;
	private String numberofheart;
	
	public String getNameofanimal() {
		return nameofanimal;
	}

	public String getNumberofheart() {
		return numberofheart;
	}
	
	public void setNameofanimal(String nameofanimal) {
		this.nameofanimal = nameofanimal;
	}

	public void setNumberofheart(String numberofheart) {
		this.numberofheart = numberofheart;
	}

	
	
	public void pump()
	{
		System.out.println("Four heart is pumping");
		System.out.println("You are alive");
	}

}
