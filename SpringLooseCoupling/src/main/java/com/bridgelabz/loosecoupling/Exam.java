package com.bridgelabz.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
 public static void main(String[] args) 
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("beancoupling.xml");
	Student abc=context.getBean("student",Student.class);
	abc.cheating();
}
}
