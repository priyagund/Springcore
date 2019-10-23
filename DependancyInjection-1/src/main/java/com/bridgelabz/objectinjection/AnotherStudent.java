/******************************************************************************
*  Purpose:dependancy injection using constructer in spring framework
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.objectinjection;

public class AnotherStudent
{
	private MathCheat cheat;

	
   
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}



	public void cheating()
	{
		cheat.mathCheat();
	}
	
}
