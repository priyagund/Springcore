package com.bridgelabz.springaop.asspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAsspect 
{
@Before("allGetters()")
 public void logginAdvice()
 {
	 System.out.println("Advice run get method call");
 }

@Before("allGetters()")
public void secondlogin() 
{
	System.out.println("secon advice run");
}


//for all getter methods
@Pointcut("execution(* get*(..))")
public void allGetter() {
}

}
