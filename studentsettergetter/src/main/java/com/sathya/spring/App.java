package com.sathya.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	
        System.out.println( "Hello World!" );
        
        Student student = context.getBean("student",Student.class);
        student.details();
        
        logger.info("Starting App...");
        
        //your Application logic is here...
        
        logger.info("App started successfully.");
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
