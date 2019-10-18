package com.bridgelabz.autowiring;

public class Human 
{
  private Heart heart;

public void setHear(Heart heart) {
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
