
/******************************************************************************
*  Purpose:  Program is written for dependency injection of spring using
 *  		 constructer injection configure in xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/package com.bridgelabz.constructuredependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
 public static void main(String[] args) 
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
	StudentCon abc=context.getBean("studentcon",StudentCon.class);
	abc.displayStudentDate();
	
	StudentCon pqr=context.getBean("studentconstruct",StudentCon.class);
	pqr.displayStudentDate();
}
}
