/******************************************************************************
*  Purpose:  Program is written for dependency injection of spring using
 *  		 setter injection configure in xml  
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/
package com.bridgelabz.dependancyinjection;

public class Student
{
  private int id;
  private String studentName;

public void setId(int id) {
	this.id = id;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}
  // display student information
public void displayStudentInfo() 
{
	System.out.println("student name is"+" " +studentName);
	System.out.println("student id is"+" "+id );
}

}
