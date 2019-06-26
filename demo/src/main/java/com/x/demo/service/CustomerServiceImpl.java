package com.x.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.demo.dao.CustomerDAO;
import com.x.demo.entity.Customerx;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO;
	@Autowired
	public CustomerServiceImpl(CustomerDAO theCustomerDAO) {
		customerDAO=theCustomerDAO;
	}
	
	
	
	@Override
	@Transactional
	public List<Customerx> findAll() {
		
		return customerDAO.findAll();
	}

	@Override
	@Transactional
	public Customerx findById(int theId) {
		
		return customerDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Customerx theCustomer) {
		customerDAO.save(theCustomer);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		customerDAO.deleteById(theId);

	}

}
