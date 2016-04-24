package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.StudentDao;
import com.institute.models.Student_profile;

public class StudentEducationServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String url = "";
		Student_profile model = new Student_profile();
		String email = request.getParameter("email");
   	
					double GRE =  Integer.parseInt(request.getParameter("GRE"));
				   	double TOFEL =  Integer.parseInt(request.getParameter("TOFEL"));
				   	double IELTS =  Double.parseDouble(request.getParameter("IELTS"));
				   	double GPA = Double.parseDouble(request.getParameter("GPA"));
				   	String date1= request.getParameter("grad_from");
				   	String degree = request.getParameter("degree");
				   	String college = request.getParameter("college");
				   	String major = request.getParameter("major");
					String date2= request.getParameter("grad_to");
				   		 
				 
				 	StudentDao.insert_into_Student_Education_db(email,GRE,TOFEL,IELTS,GPA,date1,date2,degree,major,college);
				 	model = StudentDao.check_for_email(email);
					
					 session.setAttribute("model", model);
					 session.setAttribute("email", email);
				   	
					if(request.getParameter("previous")!=null)	{	 
						 url="/ContactInfo.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
					else if(request.getParameter("next")!=null){
						url="/Employer.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				
				   	
	}
}