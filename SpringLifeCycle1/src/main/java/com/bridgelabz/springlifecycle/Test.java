package com.bridgelabz.springlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	StudentDao studentdao=context.getBean("studentdao",StudentDao.class);
	studentdao.selectAllRows();
	//studentdao.deleteStudentRecord();
	studentdao.insertStudent();
	//studentdao.deleteStudentRecord();
	((ClassPathXmlApplicationContext) context).close();
	
}
}
