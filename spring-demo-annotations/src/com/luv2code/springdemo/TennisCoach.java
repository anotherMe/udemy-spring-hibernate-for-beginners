package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach - inside default constructor");
	}

	@Autowired
	@Qualifier("sadFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach - inside setFortuneService method");
		fortuneService = theFortuneService;
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println(">> TennisCoach - inside myInit method");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println(">> TennisCoach - inside myDestroy method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
