package com.bridgelabz.objectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("beanobj.xml");
	System.out.println("beanobj.xml loaded");
	Student abc=context.getBean("student",Student.class);
     abc.cheating();
	 
	AnotherStudent pqr=context.getBean("anotherstudent",AnotherStudent.class);
    pqr.cheating();
}
}
