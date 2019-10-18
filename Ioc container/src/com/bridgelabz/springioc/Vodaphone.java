package com.bridgelabz.springioc;

public class Vodaphone implements Sim

{
  public void calling() 
{
	 System.out.println("calling using vodaphone sim"); 
}

@Override
public void data() {
	System.out.println("brousing internet using vodaphone sim");
	
}
}
