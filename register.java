package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String occ = request.getParameter("occ");
		String email = request.getParameter("newemail");
		String pass = request.getParameter("newpass");
		String confpass = request.getParameter("confpass");
		if(confpass.equals(pass))
		{
			alert("Password Does not Match");
		}
		
	}

}
