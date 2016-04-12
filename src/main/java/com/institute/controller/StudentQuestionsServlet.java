package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.DepartmentsDao;
import com.institute.models.csdepartment;
import com.institute.models.eedepartment;
import com.institute.models.medepartment;

public class StudentQuestionsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
				 String email = request.getParameter("email");
				   	int value=0;
					String department = request.getParameter("department");
					System.out.print(email);
					System.out.println(department);
					
					int ans1 = Integer.parseInt(request.getParameter("ans1"));
					int ans2 = Integer.parseInt(request.getParameter("ans2"));
					int ans3 = Integer.parseInt(request.getParameter("ans3"));
					int ans4 = Integer.parseInt(request.getParameter("ans4"));
					int ans5 = Integer.parseInt(request.getParameter("ans5"));
					
					
					
					if(department.equals("CS")){
						csdepartment m1= new csdepartment();
						value = DepartmentsDao.insert_into_cs_db(email,ans1,ans2,ans3,ans4,ans5);
						m1 = DepartmentsDao.search_fro_email_cs(email);
						session.setAttribute("m", m1);
					}
					else if(department.equals("ME")){
						medepartment m2= new medepartment();
						value = DepartmentsDao.insert_into_me_db(email,ans1,ans2,ans3,ans4,ans5);
						m2 = DepartmentsDao.search_fro_email_me(email);
					   	session.setAttribute("m", m2);
					}
					else if(department.equals("EE")){
					 	eedepartment m3= new eedepartment();
						value = DepartmentsDao.insert_into_ee_db(email,ans1,ans2,ans3,ans4,ans5);
						m3 = DepartmentsDao.search_fro_email_ee(email);
					   	session.setAttribute("m", m3);
					}
					if(value==1)
					{
						session.setAttribute("email", email);
						session.setAttribute("d", department);
						
						String url="/Student_payment.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
				   
	}
}
