package com.x.demo.service;

import java.util.List;

import com.x.demo.entity.Customerx;

public interface CustomerService {

	public List<Customerx> findAll();
	
	public Customerx findById(int theId);
	
	public void save(Customerx theCustomer);
	
	public void deleteById(int theId);

}
