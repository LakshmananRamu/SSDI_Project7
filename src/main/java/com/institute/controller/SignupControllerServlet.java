package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.institute.dao.StudentDao;


public class SignupControllerServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String url = "";
		
			   	String emailid = request.getParameter("emailid");
			   	String password = request.getParameter("password");
			   	String re_pass= request.getParameter("Retype-Password");
			   	String name = request.getParameter("Name");
			   	String gender = request.getParameter("Gender");
			   
			   	System.out.println(emailid);
			   	System.out.println(password);
			   	System.out.println(re_pass);
			   	System.out.println(name);
			   	System.out.println(gender);
		
			   	if(password.equals(re_pass)){
			   		
			   		System.out.println(emailid);
				   	StudentDao.insert_into_db(emailid,password,name,gender);
				   	url="/Signup_success.jsp";
				   	getServletContext().getRequestDispatcher(url).forward(request, response);
				   	}
			   	else{

			   		request.setAttribute("errmessage", "*password do not match");
			   		url="/Signup.jsp";
			   	 getServletContext().getRequestDispatcher(url).forward(request, response);
			   	
			   	}
		 
	}
}