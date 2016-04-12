package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.StudentDao;

public class StudentProfileServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String url = "";

				 String email = request.getParameter("email");
				   	
					String Salutation = request.getParameter("Salutation");
				   	String firstname = request.getParameter("firstname");
				   	String lastname = request.getParameter("lastname");
				   	String suffix = request.getParameter("Suffix");
				   	String pref_name = request.getParameter("preffered_firstname");
				
				   	String sex = request.getParameter("Sex");
				   	String month = request.getParameter("Month");
				   	String date = request.getParameter("Date");
				   	String year = request.getParameter("year");
				   	
				   	System.out.println(email);   	
				   	System.out.println(Salutation);
				   	System.out.println(firstname);
				   	System.out.println(lastname);
				   	System.out.println(suffix);
				   	System.out.println(pref_name);
			
				   	System.out.println(sex);
				   	System.out.println(month);
				   	System.out.println(date);
				   	System.out.println(year);
				   	int m = Integer.valueOf(month);
				   	int d = Integer.valueOf(date);
				   	int y = Integer.valueOf(year);
					  request.setAttribute("email", email);
				   	
				   		
					   	StudentDao.insert_into_Student_profile_db(email,Salutation,firstname,lastname,suffix,pref_name,sex,m,d,y);
					   	url="/ContactInfo.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					   	}
	}
