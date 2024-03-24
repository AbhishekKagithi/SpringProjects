package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
@Bean
public EmailService emailService() {
	EmailService emailService = new EmailService();
	return emailService;
	
}
@Bean
public JavaCourseService javaCourseService() {
	JavaCourseService javaCourseService = new JavaCourseService();
	return javaCourseService;
	
}
@Bean
public Student student() {
	Student student = new Student(emailService(),javaCourseService());
	
	return student;
	
}

}
