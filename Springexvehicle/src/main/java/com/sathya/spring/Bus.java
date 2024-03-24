package com.sathya.spring;

public class Bus implements Vehicle {
	private String busType;
	private int seatingCapacity;
	

	@Override
	public void move() {
		System.out.println("you have chosen to travel by bus");
		System.out.println("Bus model is "+busType);
		System.out.println("Seating capacity of the bus is "+seatingCapacity);
	}

}
