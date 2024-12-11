package com.jktech.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HowToReadFromDB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="";
		// url --> "jdbc:postgresql://+hostname+":"+port"+"//dbName"
		Connection con = DriverManager.getConnection(url,"username","password");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from tablename where column=");
		while(rs.next()) {
			System.out.println(rs.getString("columnname"));
		}
		
		

	}

}
