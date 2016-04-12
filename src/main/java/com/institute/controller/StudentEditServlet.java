package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.AdminDAO;
import com.institute.dao.DepartmentsDao;
import com.institute.models.Admin;
import com.institute.models.csdepartment;
import com.institute.models.eedepartment;
import com.institute.models.medepartment;

public class StudentEditServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();
				 String email = request.getParameter("email");
				   	String d= request.getParameter("department");
				 session.setAttribute("email",email);
					session.setAttribute("d",d);
					Admin user=new Admin();
				   	
				   	int deptid=0;
				   	if(d.equals("CS"))
				   			{
				   		deptid=1;
				   			}
				   	if(d.equals("ME"))
		   			{
		   		deptid=3;
		   			}
				   	if(d.equals("EE"))
		   			{
		   		deptid=2;
		   			}
					user=AdminDAO.getDeptID(deptid);
					if(user!=null)
					{
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
					
					csdepartment m1= new csdepartment();
				   	medepartment m2= new medepartment();
				   	eedepartment m3= new eedepartment();
					
					if(d.equals("CS")){
					m1 = DepartmentsDao.search_fro_email_cs(email);
					session.setAttribute("m", m1);
					String url="/Student_departmant_questions.jsp";
						getServletContext().getRequestDispatcher(url).forward(request, response);
					
					}
					else if(d.equals("ME")){
				   	m2 = DepartmentsDao.search_fro_email_me(email);
				   	session.setAttribute("m", m2);
				   	String url="/Student_departmant_questions.jsp";
					getServletContext().getRequestDispatcher(url).forward(request, response);
				
					}
					else if(d.equals("EE")){
				   	m3 = DepartmentsDao.search_fro_email_ee(email);
				   	session.setAttribute("m", m3);
				   	String url="/Student_departmant_questions.jsp";
					getServletContext().getRequestDispatcher(url).forward(request, response);
				
					}
				   								
			}
}

