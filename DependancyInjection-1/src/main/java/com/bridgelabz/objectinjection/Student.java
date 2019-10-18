package com.bridgelabz.objectinjection;

public class Student
{
  MathCheat mathcheat;
  
  
	
  public void setMathcheat(MathCheat mathcheat) {
	this.mathcheat = mathcheat;
}



public void cheating()
	{
		mathcheat.mathCheat();
	}

}
