package com.tns.di;

public class Student {

	private String studentname;
    private String id;
	public void setId(String id) {
		this.id = id;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public void display()
	{
		System.out.println("student name is "+studentname+" and ID of student is "+id);
	}
}
