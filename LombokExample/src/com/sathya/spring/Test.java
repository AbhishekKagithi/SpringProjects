package com.sathya.spring;

public class Test {

	public static void main(String[] args) {
		
		//constructor injecting the values
		
		Employee employee = new Employee(1,"Shami",100000);
		System.out.println(employee);
		
		// setter injection
		
		Employee employee2 = new Employee();
		employee2.setEmpId(2);
		employee2.setEmpName("Siraj");
		employee2.setEmpSalary(34568.987);
		
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());
	}
	
	
}
