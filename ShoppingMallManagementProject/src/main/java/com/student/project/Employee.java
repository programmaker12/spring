package com.student.project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_id;
	private String name;
	private float salary;
	private String designation;
	public Integer getId() {
		return employee_id;
	}
	public void setId(Integer id) {
		this.employee_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
//	public List<Shop> getShop() {
//		return shop;
//	}
//	public void setShop(List<Shop> shop) {
//		this.shop = shop;
//	}
//	public Integer getEmployee_id() {
//		return employee_id;
//	}
//	public void setEmployee_id(Integer employee_id) {
//		this.employee_id = employee_id;
//	}
}
