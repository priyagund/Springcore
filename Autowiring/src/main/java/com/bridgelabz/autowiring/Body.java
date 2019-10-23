
/******************************************************************************
*  Purpose:  Program is written for autowiring using xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body
{
  public static void main(String[] args) 
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("beanautowire.xml");
	Human human=context.getBean("human",Human.class);
	human.startPumping();
}
}
