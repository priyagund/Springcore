/******************************************************************************
*  Purpose:  Program is written for spring Aop using annotation
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.springaop.asspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAsspect 
{
//@Before("execution (public String com.bridgelabz.springaop.model.Circle.getName())" )
/*@Before("allGetters() && allCircleMethod()")
 public void logginAdvice()
 {
	 System.out.println("Advice run get method call");
 }
*/
	/*
@Before("allCircleMethod()")
 public void logginAdvice(JoinPoint joinPoint)
     {
	  System.out.println(joinPoint.toString());
	 }	
	

@Before("allGetters()")
public void secondAdvice() 
{
	System.out.println("second advice run");
}
*/
@AfterReturning("args(name)")
public void stringArgumentMethod(String name) {
	System.out.println("the method that takes string argument has been called the values is"+name);
}

/*@AfterThrowing(pointcut="args(name)",throwing="ex")
public void throwingException(String name,RuntimeException ex) {
	System.out.println("the method for throw the exception"+ex);
}*/
@Pointcut("execution(* get*())")
public void allGetters() {};

@Pointcut("within(com.bridgelabz.springaop.model.Circle)")
public void allCircleMethod() {}
	


}
