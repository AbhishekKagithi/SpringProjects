package com.sathya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	private EmailService emailService;

	private JavaCourseService javaCourseService;
	
	
	
	
	




	









	public EmailService getEmailService() {
		return emailService;
	}



















	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}



















	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}



















	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}



















	public void details()
	{
		System.out.println("student details");
		emailService.message();
		javaCourseService.courseInfo();
	}



	


	
	

}
