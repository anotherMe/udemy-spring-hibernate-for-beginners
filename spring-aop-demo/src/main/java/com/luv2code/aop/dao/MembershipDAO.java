package com.luv2code.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(">> MembershipDAO.addAccount method");
	}
	
	public void removeAccount() {
		System.out.println(">> MembershipDAO.removeAccount method");
	}
}
