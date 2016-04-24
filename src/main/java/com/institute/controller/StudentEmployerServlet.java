package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.StudentDao;
import com.institute.models.Student_profile;

public class StudentEmployerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String url = "";
		Student_profile model = new Student_profile();
		String email = request.getParameter("email");
   	
					double exp =  Integer.parseInt(request.getParameter("exp"));
				   	String emp_status = request.getParameter("emp_status");
				   	String firm = request.getParameter("firm");
				   	String pos = request.getParameter("pos");
				   	String con = request.getParameter("con");
				   	int completed = 1;
				   	
				   	StudentDao.insert_into_Student_Employer_db(email,exp,emp_status,pos,con,firm,completed);
				   	model = StudentDao.check_for_email(email);
					
					 session.setAttribute("model", model);
					 session.setAttribute("email", email);
				  					if(request.getParameter("previous")!=null)	{	 
						 url="/Education.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
					else if(request.getParameter("submit")!=null){
						 url="/Home.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				
				 
				   		 
	}
}
