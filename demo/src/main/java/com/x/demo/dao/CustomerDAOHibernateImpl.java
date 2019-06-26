package com.x.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.x.demo.entity.Customerx;
@CrossOrigin(origins="*")
@Repository
public class CustomerDAOHibernateImpl implements CustomerDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public CustomerDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	
	public List<Customerx> findAll() {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<Customerx> theQuery=currentSession.createQuery("from Customerx",Customerx.class);
		
		List<Customerx> customers=theQuery.getResultList();
		
		return customers;
	}

	@Override
	public Customerx findById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		
		Customerx theCustomer=currentSession.get(Customerx.class,theId);
		
		return theCustomer;
	}

	@Override
	public void save(Customerx theCustomer) {
		Session currentSession=entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query theQuery=currentSession.createQuery("delete from customerx where id=:customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
		
	}

}
