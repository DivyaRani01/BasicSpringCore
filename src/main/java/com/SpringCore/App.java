/*
 * Program to illustrate setter injection in spring core . In spring core we need to perform every task manually.
 * 
 */
package com.SpringCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml"); 
        student student= (student)context.getBean("stud"); 
        System.out.println(student); 
        
    }
}
