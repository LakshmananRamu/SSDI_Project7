package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.StudentDao;

public class StudentContactinfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String email = request.getParameter("email");
				   	
					String city = request.getParameter("City");
				   	String state = request.getParameter("State");
				   	String postal = request.getParameter("Postal");
				   	String phone = request.getParameter("Phone");
				   	String add1 = request.getParameter("Addline1");
				   	String add2 = request.getParameter("Addline2");
				   	String country = request.getParameter("Country");
				   	
				   	System.out.println(email);   	
				   	System.out.println(city);
				   	System.out.println(state);
				   	System.out.println(country);
				   	System.out.println(add1);
				   	System.out.println(add2);
			
				   	System.out.println(postal);
				   	System.out.println(phone);
				   		
					   	StudentDao.insert_into_Student_contactinfo_db(email,country,add1,add2,city,state,postal,phone);
					    request.setAttribute("email", email);
					   	
					   	String action = request.getParameter("previous");
						System.out.println(action);

					   	action = request.getParameter("next");
						System.out.println(action);

					   	
						if(request.getParameter("previous")!=null)	{	 
							String url="/ApplicationForm.jsp";

						   	getServletContext().getRequestDispatcher(url).forward(request, response);
						}
						else if(request.getParameter("next")!=null){
							String url="/Education.jsp";

						   	getServletContext().getRequestDispatcher(url).forward(request, response);
						}
					
					   	}
	}
