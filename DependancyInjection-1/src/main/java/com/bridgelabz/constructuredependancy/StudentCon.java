
/******************************************************************************
*  Purpose:  Program is written for dependency injection of spring using
 *  		constructer injection configure in xml 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/package com.bridgelabz.constructuredependancy;

public class StudentCon 
{
  private int id;
  private String studentName;
  
  public StudentCon(int id) 
  {
	  this.id=id;
	  
  }
  
public StudentCon(int id, String studentName)
{
	this.id = id;
	this.studentName = studentName;
}

public void displayStudentDate()
{
	System.out.println("student name is"+" "+studentName);
	System.out.println("student id is"+" "+id );
}
}
