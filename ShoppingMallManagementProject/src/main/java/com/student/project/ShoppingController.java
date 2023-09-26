package com.student.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowedHeaders = "*", allowCredentials = "")
public class ShoppingController {
	
	@Autowired
	public ShoppingService service;
	
    
	
	@GetMapping("/customer")
	 public List<Customer1> listCustomer()
	{
		return service.ListAll();
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer1> get(@PathVariable Integer id)
	{
		try {
			Customer1 customer = service.get(id);
			return new ResponseEntity<>(customer, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Customer1>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.deleteById(id);
	}
	
	@PostMapping("/customerdetails")
    public Customer1 placeorder(@RequestBody Customer1 customer)
	{
		return service.save(customer);
	}
	
	
	// From here the OrderDetail starts
	@GetMapping("/orderdetails")
	public List<OrderDetail> listOrder()
	{
		return service.ListOrder();
	}
	
	@PostMapping("/orderdetails/mentionorder")
    public OrderDetail orderDetails(@RequestBody OrderDetail order)
	{
		return service.saveOrder(order);
	}
	
	
	//From here the Employee starts
	@GetMapping("/employee")
	public List<Employee> listEmployee()
	{
		return service.ListEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id)
	{
		try {
			Employee employee = service.getEmployee(id);
			return new ResponseEntity<>(employee, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Integer id)
	{
		service.deleteEmployeeById(id);
	}
	@PostMapping("/employeedetails")
    public Employee employeeDetails(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}
	// From here the Shop starts
	@GetMapping("/shopdetails")
	public List<Shop> listShop()
	{
		return service.ListShop();
	}
	
	@PostMapping("/shopdetails/mentionshop")
    public Shop shopDetails(@RequestBody Shop shop)
	{
		return service.saveShop(shop);
	}
	

}
