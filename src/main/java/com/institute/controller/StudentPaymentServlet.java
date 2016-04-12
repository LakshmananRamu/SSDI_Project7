package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.DepartmentsDao;

public class StudentPaymentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
				 String email = request.getParameter("email");
				   	int value=0;
					String department = request.getParameter("department");
					System.out.print(email);
					System.out.println(department);
					String c=request.getParameter("card");
					System.out.println(c);
					long card = Long.parseLong(request.getParameter("card"));
					String s= String.valueOf(card);
					
					if(s.length()!=16){
						session.setAttribute("errmsg", "* 16 digit valid card number");
						
						String url="/Student_payment.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
				
					}
					else{
						session.setAttribute("errmsg", "");
					if(department.equals("CS")){
						value = DepartmentsDao.insert_card_into_cs_db(email,card);
					}
					else if(department.equals("ME")){
						value = DepartmentsDao.insert_card_into_me_db(email,card);
					}
					else if(department.equals("EE")){
						value = DepartmentsDao.insert_card_into_ee_db(email,card);
					}
					if(value==0){
						session.setAttribute("email", email);
						session.setAttribute("d", department);
						String url="/Student_submitapplication.jsp";
					   	getServletContext().getRequestDispatcher(url).forward(request, response);
					}
					}
	}
}

