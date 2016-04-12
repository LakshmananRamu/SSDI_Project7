package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.*;
import com.institute.models.*;

public class StudentEditapplicationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();
				 String email = request.getParameter("email");
				   	
				   	csdepartment m1= new csdepartment();
				   	medepartment m2= new medepartment();
				   	eedepartment m3= new eedepartment();
				   	System.out.println(email);
				   	m1 = DepartmentsDao.search_fro_email_cs(email);
				   	m2 = DepartmentsDao.search_fro_email_me(email);
				   	m3 = DepartmentsDao.search_fro_email_ee(email);
				   	System.out.println(m1);
				   	System.out.println(m2);
				   	System.out.println(m3);
				   	session.setAttribute("m1", m1);
				   	session.setAttribute("m2", m2);
				   	session.setAttribute("m3", m3);
				   	session.setAttribute("d1", "CS");
				   	session.setAttribute("d2", "ME");
				   	session.setAttribute("d3", "EE");
				   	
				   	String url="/Student_editapplication.jsp";
				   	getServletContext().getRequestDispatcher(url).forward(request, response);
				
				   	
			}
}
