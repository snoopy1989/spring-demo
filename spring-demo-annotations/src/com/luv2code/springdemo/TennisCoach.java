package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(" >> TennisCoach: inside default constructor");
	}

	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println(" >> TennisCoach: constructor with fortuneService");
		this.fortuneService = fortuneService;
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(" >> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(" >> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(" >> TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
