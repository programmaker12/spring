package com.student.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingRepository repo;
	
	@Autowired
	private OrderDetailsRepository order;
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@Autowired
	private ShopRepository shop;
	
	public List<Customer1> ListAll(){
		return repo.findAll();
	}
	
	public Customer1 save(Customer1 customer)
	{
		return repo.save(customer);
	}
	
	public Customer1 get(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void deleteById(Integer id)
	{
		repo.deleteById(id);
	}
	
	
	
	
	
	//From here the OrderDetails start
	 public List<OrderDetail> ListOrder() {
		 return order.findAll();
		 }
	 
	 public OrderDetail saveOrder(OrderDetail order1) 
	 {
		 return order.save(order1);
	 }
	 
	 public OrderDetail getOrder(Integer id)
	 {
		 return order.findById(id).get();
	 }
	
	//From here the EmployeeDetails start
		public List<Employee> ListEmployee(){
			return employeerepository.findAll();
		}
		
		public Employee saveEmployee(Employee employee)
		{
			return employeerepository.save(employee);
		}
		
		public Employee getEmployee(Integer id)
		{
			return employeerepository.findById(id).get();
		}
		
		public void deleteEmployeeById(Integer id)
		{
			employeerepository.deleteById(id);
		}
		public Employee saveOrder(Employee employee)
		{
			return employeerepository.save(employee);
		}
	
	
	//From here Shop starts
		public List<Shop> ListShop() {
			 return shop.findAll();
			 }
		 
		 public Shop saveShop(Shop shop1) 
		 {
			 return shop.save(shop1);
		 }
		 
		 public Shop getShop(Integer id)
		 {
			 return shop.findById(id).get();
		 }

}
