/******************************************************************************
*  Purpose:  Program is written for spring framework using annotation
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client
{
 public static void main(String[] args) 
 {
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
	College college=context.getBean("college",College.class);
	System.out.println("college object created"+college);
	
	college.test();
			
}
}
