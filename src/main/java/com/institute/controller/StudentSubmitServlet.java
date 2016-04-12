package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.DepartmentsDao;

public class StudentSubmitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
				 String email = request.getParameter("email");
				 String department = request.getParameter("department");
					System.out.print(email);
					System.out.println(department);
					String action= request.getParameter("submit");
					System.out.println(action);
					if(request.getParameter("submit")!=null){
						session.setAttribute("email", email);
						if(department.equals("CS")){
							 DepartmentsDao.submit_cs_db(email);
						}
						else if(department.equals("ME")){
							 DepartmentsDao.submit_me_db(email);
						}
						else if(department.equals("EE")){
							 DepartmentsDao.submit_ee_db(email);
						}

						String url="/Home.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
						
					}
					else if(request.getParameter("edit_application")!=null){
						session.setAttribute("email", email);
						String url="/Home.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
						
					}
				 
				 
	}
}