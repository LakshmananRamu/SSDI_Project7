package com.institute.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IndexControllerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String url = "";
		
		 String action = request.getParameter("action");
		 System.out.println(action);
		 if(action.equals("student")){
			 url="/Login.jsp";
			 getServletContext().getRequestDispatcher(url).forward(request, response);
		 }
		 if(action.equals("officer")){
			 url="/Officer_login.jsp";
			 getServletContext().getRequestDispatcher(url).forward(request, response);
		 }
		 else if(action.equals("teacher")){
			 url="/Department_login.jsp";
			
			 getServletContext().getRequestDispatcher(url).forward(request, response);
		 }
				
		}
}
