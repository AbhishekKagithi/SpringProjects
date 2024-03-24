package com.sathya.spring.Springex1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	//start the container
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
       System.out.println("**************");
       GreetingImpl greetingImpl = context.getBean("greet",GreetingImpl.class);
       greetingImpl.greet();
    }
}
