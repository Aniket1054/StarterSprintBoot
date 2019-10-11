package com.aniket.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Annotation configuration without XML ; With the help AppConfig.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s8 = factory.getBean(Samsung.class);
        s8.config();
    }
}
