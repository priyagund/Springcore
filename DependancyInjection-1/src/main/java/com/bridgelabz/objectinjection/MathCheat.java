/******************************************************************************
*  Purpose: Program is written for dependency injection of spring using
 *  		 object referance injection configure in xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.objectinjection;

public class MathCheat 
{
  public MathCheat() 
  {
	  System.out.println("constructer call");
  }
  
  public void mathCheat() 
  {
	  System.out.println("math cheating started");
  }
}
