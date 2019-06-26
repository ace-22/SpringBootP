package com.x.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.x.demo.dao.CustomerDAO;
import com.x.demo.entity.Customerx;
import com.x.demo.service.CustomerService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class CustomerRestController {

	private CustomerService customerService;
	@Autowired
	public CustomerRestController(CustomerService theCustomerService) {
		customerService=theCustomerService;
	}
	
	@GetMapping("/customers")
	public List<Customerx> findall(){
		return customerService.findAll();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customerx getCustomer(@PathVariable int customerId) {
		Customerx theCustomer=customerService.findById(customerId);
		if(theCustomer==null) {
			throw new RuntimeException("Employee ID not found -"+customerId);
		}
		return theCustomer;
	}
	
	@PostMapping("/customers")
	public Customerx addCustomer(@RequestBody Customerx theCustomer) {
		theCustomer.setId(0);
		customerService.save(theCustomer);
		return theCustomer;
	
	}
	
}
