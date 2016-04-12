package com.institute.controller;

import java.io.IOException;
import com.institute.dao.*;
import com.institute.models.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.institute.dao.StudentDao;

public class StudentHomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
				 String url = "";
				 Student_profile model = new Student_profile();
				 String email = request.getParameter("email");
				 model = StudentDao.check_for_email(email);
			
				 session.setAttribute("model", model);
				 session.setAttribute("email", email);
					url="/ApplicationForm.jsp";
				   	getServletContext().getRequestDispatcher(url).forward(request, response);
				   
	}
}