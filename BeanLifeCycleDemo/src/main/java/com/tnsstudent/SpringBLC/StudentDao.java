package com.tnsstudent.SpringBLC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	
	Scanner sc = new Scanner(System.in);
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/?user=root";
	private String username = "root";
	private String password = "root";
	Connection con;
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Inside the action init method....");
		createStudentDbConnection();
	}
	
	public void createStudentDbConnection() throws Exception {
        Class.forName(driver);
		
		//get a connection
		con = DriverManager.getConnection(url, username, password);
	}
	// Selecting allrows from a table
	public void selectAllRows() throws SQLException, ClassNotFoundException
	{
		
;		//public void createStudentDbConnrction();
		System.out.println("Retrieving data");
		//Load Driver
		
		
		//execute the statement
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM demodatabase.hostelinformation");
		
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);
			
			System.out.println(studentId+ " "+studentName + " " + hostelFees + " " + foodType );
		}
		
		
	}
	
	public void deleteStudentRecord (int id ) throws SQLException, ClassNotFoundException {
		
		
		// execute query
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("DELETE FROM demodatabase.hostelinformation WHERE studentId="+id);
		
		System.out.println("Record deleted from the table with id : "+id);
		
		
		
	}
	@PreDestroy
	public void closeConnection() throws Exception {
		//closing connection
		con.close();
	}

}
