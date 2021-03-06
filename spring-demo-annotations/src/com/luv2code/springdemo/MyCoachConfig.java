package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCoachConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach gymCoach() {
		return new GymCoach(new RandomFortuneService());
	}
	
//	@Bean
//	public Coach tennisCoach() {
//		return new TennisCoach();
//	}
}
