package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyClass.class);
    	
    	
        System.out.println( "Hello World!" );
        
        Student student = context.getBean("student",Student.class);
        student.details();
    }
}
