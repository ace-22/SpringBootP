package com.x.demo.dao;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.x.demo.entity.Customerx;
@CrossOrigin(origins="*")
public interface CustomerDAO {
	
	public List<Customerx> findAll();
	
	public Customerx findById(int theId);
	
	public void save(Customerx theCustomer);
	
	public void deleteById(int theId);

}
