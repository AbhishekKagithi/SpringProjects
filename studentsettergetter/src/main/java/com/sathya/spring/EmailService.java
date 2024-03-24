package com.sathya.spring;

import org.springframework.stereotype.Component;


public class EmailService implements MessageService {

	@Override
	public void message() {
		System.out.println("the e mail is registered");
		System.out.println("E mail sevice is provided to student");
	}

}
