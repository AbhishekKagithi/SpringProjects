package com.sathya.spring;

public class Person {
	private String name;
	private String email;
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
	
	public void personInfo()
	{
		System.out.println("The person details are ");
		System.out.println("The person name is "+name);
		System.out.println("The person email is "+email);
	}
	public Person() {
		System.out.println("Spring object");
	}
	

}
