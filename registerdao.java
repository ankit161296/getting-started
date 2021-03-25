package com.login.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.Connection;
public class registerdao {
	
	public void insertvalue(String email, String pass) {
		
		String sql = "insert into login values(?,?)";
		String url="jdbc:mysql://localhost::3306/ankit";
		String username="root";
		String password="radha";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, email);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
