package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Get up from the couch |";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
