package com.bridgelabz.beanannotation;

import org.springframework.stereotype.Component;

import com.bridgelabz.component.Principal;

public class College 
{  
	private Principal  principal; 

public College(Principal principal) 
{	
  this.principal = principal;
}

public void test() 
{     
	 principal.principalInfo();
	  System.out.println("test is done");
}

}