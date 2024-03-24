package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	//start the container
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       System.out.println("**************");
       GreetingImpl greetingImpl = context.getBean("greet",GreetingImpl.class);
       greetingImpl.greet();
    }
}
