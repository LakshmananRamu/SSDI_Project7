package com.institute.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

import com.institute.models.*;
import com.institute.dao.*;
import com.institute.controller.*;
import com.institute.models.Student_profile;

/**
 * Servlet implementation class UserControllerServlet
 */
@WebServlet("/StatusServlet")
public class StudentstatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String Dept_ID;
	int Dept;
	/**
     * Default constructor. 
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "";

        String emailid = request.getParameter("email");
        
        String action = request.getParameter("action");
        System.out.println("action"+action);
        if (action == null) {
            url = "/Home.jsp";
        }
        if (action.equals("CS application")) 
        {
        	Dept=1;
        }
        if (action.equals("EE application")) 
        {
        	Dept=2;
        }
        if (action.equals("ME application")) 
        {
        	
        	Dept=3;
        }
        
        request.setAttribute("Dept", Dept);
        StudentStatus applications;
                 if(action.equals("ME application")||action.equals("EE application")||action.equals("CS application"))          
                 {
                	 StudentStatusDao status=new StudentStatusDao();
                	 applications=StudentStatusDao.getstatus(emailid,Dept);
                	 String result=applications.getStatus();
                	 String offer=applications.getoffer();
                 
                	 
                	 if(result.equals("selected")&&offer==null)
                 {
                url="/Selected.jsp";	 
                 }
                	 if(offer!=null)
                	 {
                		 JOptionPane.showMessageDialog(null, "You have already made your decision", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
                      	request.setAttribute("msg", "Application already exists");
                          url = "/Home.jsp";	
                	 }
                 if(result.equals("rejected"))
                 {
                	 JOptionPane.showMessageDialog(null, "We are sorry to let you know that you have not been offered admission", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
                 	request.setAttribute("msg", "Application already exists");
                     url = "/Home.jsp";	 
                 }

                 if(result.equals("wiatinglist")||result.equals("not available"))
                 {
                	 JOptionPane.showMessageDialog(null, "Application Decision have not been made", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
                 	request.setAttribute("msg", "Application already exists");
                     url = "/Home.jsp";	 
                 }	  
                 else if(!(result.equals("wiatinglist"))&&!(result.equals("not available"))&&!(result.equals("selected"))&&!(result.equals("rejected")))
                 {
                	 JOptionPane.showMessageDialog(null, "Application Decision have not been made", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
                  	request.setAttribute("msg", "Application already exists");
                      url = "/Home.jsp";
                 }
        getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	

}
}