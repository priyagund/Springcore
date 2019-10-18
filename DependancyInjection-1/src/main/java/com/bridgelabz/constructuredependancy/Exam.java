package com.bridgelabz.constructuredependancy;

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