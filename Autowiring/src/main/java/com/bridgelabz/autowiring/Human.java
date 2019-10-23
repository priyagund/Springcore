/******************************************************************************
*  Purpose:  Program is written for autowiring using xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.autowiring;

public class Human 
{
  private Heart heart;

/*public Human(Heart heart) {
	
	this.heart = heart;
	System.out.println("human constructer call as heart as argument");
}*/

public void setHeart(Heart heart) {
	this.heart = heart;
}
  
public void startPumping() 
{
  if(heart!=null) 
  {
	  heart.pump();
  }
  else
  {
	System.out.println("you dead");  
  }
}
 
}
