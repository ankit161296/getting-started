package com.login.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

import com.google.gson.Gson;
//import com.mysql.jdbc.*;
//import com.mysql.jdbc.ResultSet;



public class LoginDao {
	public boolean check(String uname, String pass)
	{
		String sql = "select * from login where uname=? and pass=?";
		String url="jdbc:mysql://localhost:3306/ankit";
		String username="root";
		String password="radha";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			/*Gson gson = new Gson();
			gson.toJson(rs);
			System.out.println(gson.toJson(rs));*/
			if(rs.next()==false)
				return true;
			
			con.close();
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
}
