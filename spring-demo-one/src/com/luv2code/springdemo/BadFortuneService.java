package com.luv2code.springdemo;

import java.util.Random;

public class BadFortuneService implements FortuneService {

	private String[] unfortunateEvents;
	
	public BadFortuneService() {
		
		unfortunateEvents = new String[3];
		unfortunateEvents[0] = "You just walked under a ladder";
		unfortunateEvents[1] = "Black cat just crossed your steps";
		unfortunateEvents[2] = "You broke the mirror";
	}
	
	@Override
	public String getFortune() {
		
		int rnd = getRandomNumberInRange(0, 2);
		return String.format("Better watch your steps today: %s", unfortunateEvents[rnd]);
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
