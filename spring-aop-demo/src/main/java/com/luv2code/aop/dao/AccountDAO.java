package com.luv2code.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(">> AccountDAO.addAccount method");
	}
	
	public void removeAccount() {
		System.out.println(">> AccountDAO.removeAccount method");
	}
}
