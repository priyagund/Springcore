package com.bridgelabz.springlifecycle;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
{   
	 int responce;
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	StudentDao studentdao=context.getBean("studentdao",StudentDao.class);
	do {
		System.out.println("enter 1.insert student\n2.delete student\n3.show data");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1: //insert student data
			studentdao.insertStudent();
			break;
			
		case 2://delete student data	
			studentdao.deleteStudentRecord();
			break;
			
		case 3://show student data
			studentdao.selectAllRows();
			break;
			
		default :
			System.out.println("wrong choice you enter");
			break;
		 }
		System.out.println("dou you want to continue 1.Yes\n 2.No");
		 responce=sc.nextInt();
	}
	while(responce==1);
    System.out.println("thank you for being with us");
	
	
	((ClassPathXmlApplicationContext) context).close();
	
}
}
