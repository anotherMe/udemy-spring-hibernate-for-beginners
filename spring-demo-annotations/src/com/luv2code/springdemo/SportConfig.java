package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * WITHOUT COMPONENT SCAN
 * 
 * In this configuration we do not specify the @ComponentScan annotation
 * so we have to manually declare our beans.
 * 
 * @author Marco
 *
 */

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
