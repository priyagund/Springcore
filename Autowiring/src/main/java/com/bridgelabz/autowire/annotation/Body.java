package com.bridgelabz.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.autowiring.Human;

public class Body 
{
  public static void main(String[] args) 
  {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beanautoanoo.xml");
	HumanAno human=context.getBean("humanano",HumanAno.class);
	human.startPumping(); 
    
  }
  
}
