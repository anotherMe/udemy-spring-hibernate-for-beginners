package com.luv2code.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before("execution(* com.luv2code.aop.dao.*.add*())")
	public void beforeAddAccountAdvice() {
		System.out.println(">>>> Advice executing !");
	}
}
