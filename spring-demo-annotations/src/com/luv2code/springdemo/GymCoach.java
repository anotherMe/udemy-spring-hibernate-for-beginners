package com.luv2code.springdemo;

public class GymCoach implements Coach {

	private FortuneService fortuneService;  
	
	public GymCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Lift that barbell !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
