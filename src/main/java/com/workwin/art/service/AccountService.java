package com.workwin.art.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.workwin.art.model.Account;



@Service
public class AccountService{
	
	@Autowired 
	private EntityManager entityManager;

	
	
	public void deposit(int fromAccount, int accountId, long balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "application" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	}
	
	

}
