package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Having starting the course over, I've create a new demo project
 * with a slightly different name. 
 *
 */
public class MyApp {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml")) {
			
			Coach coach1 = context.getBean("myCoach1", Coach.class);
			System.out.println(coach1.getDailyWorkout());
			System.out.println(coach1.getDailyFortune());
			System.out.println(coach1.getInformation());
			
			Coach coach2 = context.getBean("myCoach1", Coach.class);
			System.out.println(coach2.getDailyWorkout());
			System.out.println(coach2.getDailyFortune());
			System.out.println(coach2.getInformation());
		}

	}

}
