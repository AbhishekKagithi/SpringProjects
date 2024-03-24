package com.sathya.spring;

public class Traveller {
	private String name;
	private String email;
	private long mobile;
	Vehicle vehicle;
//Generate setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney()
	{
		System.out.println("hey"+name+"welcome to deb travels");
		System.out.println("your mobile is "+mobile+"e mail is "+email);
		vehicle.move();
	}
}
