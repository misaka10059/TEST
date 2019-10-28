package com.mn.dubboDemo_Provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring.xml");
        System.out.println( "Hello World!" );
        context.start();
        
        System.in.read();
    }
}
