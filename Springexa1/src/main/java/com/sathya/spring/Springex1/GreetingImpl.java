package com.sathya.spring.Springex1;

public  class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("This is spring example");
		
	}

	public GreetingImpl() {
		
		System.out.println("GreetingImpl:constructor::object created");
	}

	
		
	}
	

