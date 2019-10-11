package com.aniket.dependencyinjection;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency injection with XML beans
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
