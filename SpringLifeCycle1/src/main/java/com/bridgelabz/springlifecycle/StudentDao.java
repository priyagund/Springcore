package com.bridgelabz.springlifecycle;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDao {
	private String driver;
	private String userName;
	private String password;
	private String url;

	static Connection con;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

// creating init method
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside init method");
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
		
	}

	public void selectAllRows() throws SQLException, ClassNotFoundException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM college.student");

		while (rs.next()) {
			while (rs.next()) {
				System.out.println("name of student is " + rs.getInt(1));
				System.out.println("Id of student is " + rs.getString(2));
				System.out.println("food of student is " + rs.getString(3));
				System.out.println();
			}
		}

	}

	public void deleteStudentRecord() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		String query = "delete from student where id=?";
		PreparedStatement st = con.prepareStatement(query);
		System.out.println("enter id of student to be deleted");
		st.setInt(1, sc.nextInt());
		st.executeUpdate();
		System.out.println("student deleted successfully");

	}
	
	public void insertStudent() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		String query="insert into student values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		System.out.println("enter id");
		int id=sc.nextInt();
		pst.setInt(1, id);
		System.out.println("enter name");
		String name=sc.next();
		pst.setString(2, name);
		System.out.println("enter address");
		String address=sc.next();
		pst.setString(3, address);
		pst.executeUpdate();
		System.out.println("student data inserted successfully");
	}
	
	//for distroy
	@PreDestroy
	public void distroy() throws SQLException
	{
    	System.out.println("inside destroy method");
    	con.close();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
}
