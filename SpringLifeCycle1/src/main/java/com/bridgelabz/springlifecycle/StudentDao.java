package com.bridgelabz.springlifecycle;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.annotation.PostConstruct;

public class StudentDao {
	private String Driver;
	private String userName;
	private String password;
	private String url;

	private Connection con;
	

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getDriver() {
		System.out.println("inside setter");
		return Driver;
	}

	public void setDriver(String driver) {
		Driver = driver;
	}

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
		createDbconnection();
	}

// creating connection
	public void createDbconnection() throws SQLException, ClassNotFoundException {
		Class.forName("Driver");
		con = DriverManager.getConnection(url, userName, password);
	}

	public void selectAllRows() throws SQLException, ClassNotFoundException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM college.student");

		while (rs.next()) {
			int StudentId = rs.getInt(1);
			String StudentName = rs.getString(2);
			String StudentAdd = rs.getString(3);
			System.out.println(StudentId + " " + StudentName + " " + StudentAdd + " ");
		}

	}

	public void deleteStudentRecord(int studentid) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		String query = "delete from mess where id=?";
		PreparedStatement st = con.prepareStatement(query);
		System.out.println("enter id of student to be deleted");
		st.setInt(1, sc.nextInt());
		st.executeUpdate();
		System.out.println("student deleted successfully");

	}
	
	//for destroy object

	public void distroy() throws SQLException
	{
		
		System.out.println("inside distroy method");
		con.close();
		
	}
}
