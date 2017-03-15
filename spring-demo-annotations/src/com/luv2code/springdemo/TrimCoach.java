package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrimCoach() {
		System.out.println(" >> TrimCoach default constructor");
	}
	
	@Autowired
	@Qualifier("fileFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Trim 100 meters!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
