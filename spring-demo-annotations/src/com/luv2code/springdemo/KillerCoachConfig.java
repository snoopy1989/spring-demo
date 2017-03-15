package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KillerCoachConfig {

	@Bean
	public FortuneService luckyFortuneService() {
		return new LuckyFortuneService();
	}
	
	@Bean
	public Coach killerCoach() {
		return new KillerCoach(luckyFortuneService());
	}
}
