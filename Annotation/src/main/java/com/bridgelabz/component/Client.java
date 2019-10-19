package com.bridgelabz.component;

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
