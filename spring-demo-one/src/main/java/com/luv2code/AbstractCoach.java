package com.luv2code;

public abstract class AbstractCoach implements Coach {

	private String emailAddress;

	private String team;
	
	private FortuneService fortuneService;
	
	public AbstractCoach() {
		System.out.println(String.format("Inside %s no-arg constructor", this.getClass()));
	}
	
	public void initMyBean() {
		System.out.println(String.format("This is %s initMyBean method", this.getClass()));
	}
	
	public void destroyMyBean() {
		System.out.println(String.format("This is %s destroyMyBean method", this.getClass()));
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(String.format("Inside %s setFortuneService method", this.getClass()));
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getInformation() {
		return String.format("I'm the coach of the %s team. Email me to %s", getTeam(), getEmailAddress());
	}
}
