package com.sathya.spring;

public class Car implements Vehicle {
	private String fuelType;
	private int maxSpeed;
	

	@Override
	public void move() {
		System.out.println("you have chosen to travel by car");
		System.out.println("fuel to be filled in car is "+fuelType);
		System.out.println("maximum speed of car is "+maxSpeed);
	}

}
