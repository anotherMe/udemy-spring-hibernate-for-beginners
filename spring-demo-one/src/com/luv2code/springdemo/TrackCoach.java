package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Keep running";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	
	public void doMyStartupStuff() {
		System.out.println("Inside method doMyStartupStuff()");
	};
	
	public void doMyCleanupStuff() {
		System.out.println("Inside method doMyCleanupStuff()");
	};
}
