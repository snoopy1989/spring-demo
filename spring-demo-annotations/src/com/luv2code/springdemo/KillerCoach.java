package com.luv2code.springdemo;

public class KillerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public KillerCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Go out and kill someone!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
