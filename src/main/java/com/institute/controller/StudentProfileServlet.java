package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.StudentDao;
import com.institute.models.Student_profile;

public class StudentProfileServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
				 String url = "";
				 Student_profile model = new Student_profile();
				 String email = request.getParameter("email");
				   	
					String Salutation = request.getParameter("Salutation");
				   	String firstname = request.getParameter("firstname");
				   	String lastname = request.getParameter("lastname");
				   	String pref_name = request.getParameter("preffered_firstname");
				   	String sex = request.getParameter("Sex");
				   	String dob = request.getParameter("dob");
				  		
					   	StudentDao.insert_into_Student_profile_db(email,Salutation,firstname,lastname,pref_name,sex,dob);
					   	
					    model = StudentDao.check_for_email(email);
						
						 session.setAttribute("model", model);
						 session.setAttribute("email", email);
					   	url="/ContactInfo.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					   	}
	}
