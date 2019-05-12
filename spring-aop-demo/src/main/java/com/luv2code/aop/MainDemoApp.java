package com.luv2code.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aop.dao.AccountDAO;
import com.luv2code.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
		accountDao.addAccount();
		accountDao.removeAccount();
		
		MembershipDAO membershipDao = context.getBean("membershipDAO", MembershipDAO.class);
		membershipDao.addAccount();
		membershipDao.removeAccount();
		
		context.close();
	}

}
