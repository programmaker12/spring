package com.tns1.student;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;







@RestController
public class ProductControler {

	@Autowired
	public ProductService service;
	
	@GetMapping("/product")
	public List<Product> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> get (@PathVariable Integer id)
	{
		try
		{
			Product product=service.get(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//REStful API method for create operation
		@PostMapping("/product")
		public void add(@RequestBody Product product)
		{
			service.save(product);
		}
		
		//RESTFul API method for Update operation
		@PutMapping("/product/{id}")
		public ResponseEntity<?> update(@RequestBody Product product,@ PathVariable Integer id)
		{
			try
			{
				Product existProduct=service.get(id);
				service.save(product);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		//RESTful API method for Delete operation
		@DeleteMapping("/product/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
	
}
