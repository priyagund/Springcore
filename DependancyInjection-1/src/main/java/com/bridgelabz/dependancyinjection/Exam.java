
/******************************************************************************
*  Purpose:  Program is written for dependency injection of spring using
 *  		setter injection configure in xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
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
