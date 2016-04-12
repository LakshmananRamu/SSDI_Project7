package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.StudentDao;

public class StudentEducationServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String email = request.getParameter("email");
				 	
					double GRE =  Integer.parseInt(request.getParameter("GRE"));
				   	double TOFEL =  Integer.parseInt(request.getParameter("TOFEL"));
				   	double IELTS =  Double.parseDouble(request.getParameter("IELTS"));
				   	double GPA = Double.parseDouble(request.getParameter("GPA"));
				   	double from_m = Double.parseDouble(request.getParameter("from_m"));
				   	double from_y = Double.parseDouble(request.getParameter("from_y"));
				   	double to_m = Double.parseDouble(request.getParameter("to_m"));
				   	double to_y = Double.parseDouble(request.getParameter("to_y"));
				   	String degree = request.getParameter("degree");
				   	String major = request.getParameter("major");
				   		 
				 
				 	StudentDao.insert_into_Student_Education_db(email,GRE,TOFEL,IELTS,GPA,from_m,from_y,to_m,to_y,degree,major);
				    request.setAttribute("email", email);
				   	
					String action = request.getParameter("previous");
					System.out.println(action);

				   	action = request.getParameter("next");
					System.out.println(action);

				   	
					if(request.getParameter("previous")!=null)	{	 
						String url="/ContactInfo.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
					else if(request.getParameter("next")!=null){
						String url="/Employer.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				
				   	
	}
}