package com.bridgelabz.springaop.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springaop.model.Triangel;
import com.bridgelabz.springaop.service.ShapeService;

public class main
{
 public static void main(String[]args)
 {
	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	 ShapeService shape=context.getBean("shapeservice",ShapeService.class);
	 
	 
 }
}
