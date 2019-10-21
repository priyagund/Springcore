package com.bridgelabz.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HumanAno 
{
  private Heart heart;
  // creating default consturcter
   
  public HumanAno () 
  {
  
  }
  //@Autowired
public HumanAno(Heart heart) {
	
	this.heart = heart;
	System.out.println("human constructer call as heart as argument");
}

  @Autowired
  @Qualifier("humanheart")
public void setHeart(Heart heart) {
	this.heart = heart;
}
  
public void startPumping() 
{
  if(heart!=null) 
  {
	  heart.pump();
	  System.out.println("name of animal is"+ " "+heart.getNameOfAnimal() +"no of heart is" +" "+heart.getNoOfHeart());
  }
  else
  {
	System.out.println("you dead");  
  }
}
 
}
