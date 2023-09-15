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
	@Autowired 
	private ShoppingRepository repository;

	
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
	@GetMapping("/customer/order")
	public List<OrderDetails> listOrder()
	{
		return service.ListOrder();
	}
	
	@GetMapping("/customer/order/{id}")
	public ResponseEntity<OrderDetails> getOrder(@PathVariable Integer id)
	{
		try {
			OrderDetails order = service.getOrder(id);
			return new ResponseEntity<>(order, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/customer/Order/{id}")
	public void deleteOrder(@PathVariable Integer id)
	{
		service.deleteOrderById(id);
	}
	@PostMapping("/customer/placeorder")
    public OrderDetails placeorder(@RequestBody OrderDetails order)
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
	
	@GetMapping("/employee/shop")
	public List<Shop> listShop()
	{
		return service.ListShop();
	}
	
	@GetMapping("/employee/shop/{id}")
	public ResponseEntity<Shop> getShop(@PathVariable Integer id)
	{
		try {
			Shop shop = service.getShop(id);
			return new ResponseEntity<>(shop, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/employee/shop/{id}")
	public void deleteShop(@PathVariable Integer id)
	{
		service.deleteOrderById(id);
	}
	@PostMapping("/employeedetails/shopdetails")
    public Shop shopDetails(@RequestBody Shop shop)
	{
		return service.saveShop(shop);
	}

}
