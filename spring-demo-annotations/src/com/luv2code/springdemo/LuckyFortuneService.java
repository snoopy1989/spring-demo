package com.luv2code.springdemo;

public class LuckyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a LuckyFortuneService day";
	}

}
