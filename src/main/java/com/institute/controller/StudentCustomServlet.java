package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.AdminDAO;
import com.institute.dao.StudentDao;
import com.institute.models.Admin;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.institute.dao.StudentDao;
import com.institute.dao.AdminDAO;
import com.institute.models.Admin;
import com.institute.dao.DepartmentsDao;
import com.institute.models.csdepartment;
import com.institute.models.eedepartment;
import com.institute.models.medepartment;


public class StudentCustomServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				 String email = request.getParameter("email");
				 	int deptid=1;
					String custom1 = request.getParameter("custom1");
					String custom2 = request.getParameter("custom2");
					String custom3 = request.getParameter("custom3");
					String custom4 = request.getParameter("custom4");
					String custom5 = request.getParameter("custom5");
				   	if(custom1=="yes")
				   	{
				   		custom1="1";
				  
				   	}
				   	else
				   	{
				   		custom1="0";
				   	}
				 	if(custom2=="yes")
				   	{
				   		custom2="1";
				  
				   	}
				   	else
				   	{
				   		custom2="0";
				   	}
				 	if(custom3=="yes")
				   	{
				   		custom3="1";
				  
				   	}
				   	else
				   	{
				   		custom3="0";
				   	}
				 	if(custom4=="yes")
				   	{
				   		custom4="1";
				  
				   	}
				   	else
				   	{
				   		custom4="0";
				   	}
				 	if(custom5=="yes")
				   	{
				   		custom5="1";
				  
				   	}
				   	else
				   	{
				   		custom5="0";
				   	}
				   	int completed = 1;
				   	Admin user=new Admin();
				   	StudentDao.insert_into_custom_db(email,custom1,custom2,custom3,custom4,custom5);
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
					url="/Student_payment.jsp";	
					}
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				
				 
				   		 
	

}
