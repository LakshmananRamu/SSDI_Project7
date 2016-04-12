package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.StudentDao;
import com.institute.dao.AdminDAO;
import com.institute.models.Admin;
public class StudentEmployerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String email = request.getParameter("email");
				 	int deptid=1;
					double exp =  Integer.parseInt(request.getParameter("exp"));
				   	String emp_status = request.getParameter("emp_status");
				   	String pos = request.getParameter("pos");
				   	String con = request.getParameter("con");
				   	int completed = 1;
				   	Admin user=new Admin();
				   	StudentDao.insert_into_Student_Employer_db(email,exp,emp_status,pos,con,completed);
				    request.setAttribute("email", email);
				   	
					String action = request.getParameter("previous");
					System.out.println(action);

				   	action = request.getParameter("submit");
					System.out.println(action);

				   	String url="";
					if(request.getParameter("previous")!=null)	{	 
						url="/Education.jsp";

					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
					else if(request.getParameter("submit")!=null){
						user=AdminDAO.getDeptID(deptid);
						if(user!=null)
						{
						url="/Home.jsp";
						String custom1=user.getCustomQuestion1(); 
						String custom2=user.getCustomQuestion2();
						String custom3=user.getCustomQuestion3();
						String custom4=user.getCustomQuestion4();
						String custom5=user.getCustomQuestion5();
						System.out.println("custom1"+custom1);
						request.setAttribute("custom1", custom1);
						request.setAttribute("custom2", custom2);
						request.setAttribute("custom3", custom3);
						request.setAttribute("custom4", custom4);
						request.setAttribute("custom5", custom5);
						
						}
						else
						{
							url="/Home.jsp";
						}
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				
				 
				   		 
	}
}
