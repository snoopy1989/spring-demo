package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	// String array of fortunes
	private String[] fortunesArray = {
			"You are happy today!", 
			"Better go home.", 
			"Today you are very tired."
	};
	
	// random number generator
	private Random rand = new Random();

	@Override
	public String getFortune() {
		// random index of fortunesArray
		int index = rand.nextInt(fortunesArray.length);
		
		return fortunesArray[index];
	}

}
