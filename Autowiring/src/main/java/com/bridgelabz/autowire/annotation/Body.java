/******************************************************************************
*  Purpose:  Program is written for autowiring using annotation
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
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
