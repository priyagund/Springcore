package com.bridgelabz.dependancyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
  public static void main(String[] args)
  {
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	Student abc=context.getBean("student",Student.class);
	abc.displayStudentInfo();
	
	Student pqr=context.getBean("student1",Student.class);
	pqr.displayStudentInfo();
	
}
}