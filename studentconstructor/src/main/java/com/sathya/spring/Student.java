package com.sathya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	private EmailService emailService;

	private JavaCourseService javaCourseService;
	
	
	
	
	




	public Student(EmailService emailService, JavaCourseService javaCourseService) {
		super();
		this.emailService = emailService;
		this.javaCourseService = javaCourseService;
	}









	public void details()
	{
		System.out.println("student details");
		emailService.message();
		javaCourseService.courseInfo();
	}



	


	
	

}
