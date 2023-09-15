package com.student.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingRepository repo;
	@Autowired
	private OrderDetailsRepository repo1;
	@Autowired
	private EmployeeRepository employeerepository;
	@Autowired
	private ShopRepository shoprepository;
	
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
	public List<OrderDetails> ListOrder(){
		return repo1.findAll();
	}
	
	public void save(OrderDetails order)
	{
		repo1.save(order);
	}
	
	public OrderDetails getOrder(Integer id)
	{
		return repo1.findById(id).get();
	}
	
	public void deleteOrderById(Integer id)
	{
		repo1.deleteById(id);
	}
	public OrderDetails saveOrder(OrderDetails order)
	{
		return repo1.save(order);
	}
	
	//From here the OrderDetails start
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
	 public List<Shop> ListShop(){
		return shoprepository.findAll();
	}
	
	public void save(Shop shop)
	{
		shoprepository.save(shop);
	}
	
	public Shop getShop(Integer id)
	{
		return shoprepository.findById(id).get();
	}
	
	public void deleteShopById(Integer id)
	{
		shoprepository.deleteById(id);
	}
	public Shop saveShop(Shop shop)
	{
		return shoprepository.save(shop);
	}

}
