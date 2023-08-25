package com.amdocs.MyFirstSpringProject.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	String connectionUrl = "jdbc:oracle:thin:@localhost:1521:XE";
	String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	String userName = "sys as sysdba";  String passWord = "tiger";
	
	
	@GetMapping("testdb")
	public String testDb()
	{
		try
		{
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection(connectionUrl, userName, passWord);
			return "Successfully Connected to " + connectionUrl;
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		return "Can not Connect to DB !!!";
	}
}