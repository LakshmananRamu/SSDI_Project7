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
@WebServlet("/UserControllerServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String Dept_ID;
	int Dept;
	/**
     * Default constructor. 
     */
    public loginServlet() {
        // TODO Auto-generated constructor stub
    }

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
        String action = request.getParameter("action");
        if (action == null) {
            url = "/AdminHome.jsp";
        }
        if (action.equals("Create CS Application form")||action.equals("Send Email to Selected CS Students")||action.equals("Send Email to Rejected CS Students")) 
        {
        	this.Dept_ID="Create CS Application form";
        	Dept=1;
        }
        if (action.equals("Create EE Application form")||action.equals("Send Email to Selected EE Students")||action.equals("Send Email to Rejected EE Students")) 
        {
        	this.Dept_ID="Create EE Application form";
        	Dept=2;
        }
        if (action.equals("Create ME Application form")||action.equals("Send Email to Selected ME Students")||action.equals("Send Email to Rejected ME Students")) 
        {
        	this.Dept_ID="Create ME Application form";
        	Dept=3;
        }
        if (action.equals("Edit CS Application form")) 
        {
        	this.Dept_ID="Edit CS Application form";
        	Dept=1;
        }
        if (action.equals("Edit EE Application form")) 
        {
        	this.Dept_ID="Edit EE Application form";
        	Dept=2;
        }
        if (action.equals("Edit ME Application form")) 
        {
        	this.Dept_ID="Edit ME Application form";
        	Dept=3;
        }
        if (action.equals("View all CS applications")) 
        {
        	this.Dept_ID="View all CS applications";
        	Dept=1;
        }
        if (action.equals("View all EE Applications")) 
        {
        	this.Dept_ID="View all EE Applications";
        	Dept=2;
        }
        if (action.equals("View all ME Applications")) 
        {
        	this.Dept_ID="View all ME Applications";
        	Dept=3;
        }
        
        if (action.equals("Create CS Application form")||action.equals("Create EE Application form")||action.equals("Create ME Application form")) 
        {
            
            //check whether user exists in DB 
            Admin existingUser = AdminDAO.getDeptID(this.Dept);
            System.out.println(existingUser.getDeptId());
            request.setAttribute("Dept_ID", Dept_ID);
            
            if (this.Dept!=existingUser.getDeptId()) {
            	
                        url = "/NewApplication.jsp";
                        
                    } 
                
             else {
            	 JOptionPane.showMessageDialog(null, "Application already exists", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
            	request.setAttribute("msg", "Application already exists");
                url = "/AdminHome.jsp";
            }
        }
            if (action.equals("Edit CS Application form")||action.equals("Edit EE Application form")||action.equals("Edit ME Application form")) 
            {
                
                //check whether user exists in DB 
                Admin existingUser1 = AdminDAO.getDeptID(this.Dept);
                System.out.println(existingUser1.getDeptId());
                if (this.Dept==existingUser1.getDeptId()) {
                	
                String CustomSections=existingUser1.getCustomSection();
                String CustomQuestion1=existingUser1.getCustomQuestion1();
                String CustomQuestion2=existingUser1.getCustomQuestion2();
                String CustomQuestion3=existingUser1.getCustomQuestion3();
                String CustomQuestion4=existingUser1.getCustomQuestion4();
                String CustomQuestion5=existingUser1.getCustomQuestion5();
                request.setAttribute("CustomSections", CustomSections);
                request.setAttribute("CustomQuestion1", CustomQuestion1);
                request.setAttribute("CustomQuestion2", CustomQuestion2);
                request.setAttribute("CustomQuestion3", CustomQuestion3);
                request.setAttribute("CustomQuestion4", CustomQuestion4);
                request.setAttribute("CustomQuestion5", CustomQuestion5);
                request.setAttribute("Dept_ID", Dept_ID);
                
                url = "/EditApplication.jsp";
                        } 
                    
                 else {
                	 JOptionPane.showMessageDialog(null, "No Application exists to edit", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
                	request.setAttribute("msg", "Application already exists");
                    url = "/AdminHome.jsp";
                }

        }
            

            if (action.equals("View all CS applications")||action.equals("View all EE Applications")||action.equals("View all ME Applications")) 
            {
                
                //check whether user exists in DB 
            	List<String> applications ;
            	//= new ArrayList<String>(); 
            			//StudentDao.getDeptID(this.Dept);
                applications= StudentDao.getDeptID(this.Dept);
            	for(int i=0;i<applications.size();i++)
            	{
            		applications.set(0,applications.get(0));
            	}
                request.setAttribute("applications", applications);
                
                System.out.println(applications);
                
                url="/applications.jsp" ;   
                
            }
            if (action.equals("Setup Weightage for ME Applications"))
            {
            	url="/MEWeightage.jsp";
            }
            if (action.equals("Setup Weightage for CS Applications"))
            {
            	url="/CSWeightage.jsp";
            }
            if (action.equals("Setup Weightage for EE Applications"))
            {
            	url="/EEWeightage.jsp";
            }
            if (action.equals("Setup Student Vacancies for ME Applications"))
            {
            	url="/MEStudentVacancies.jsp";
            }
            if (action.equals("Setup Student Vacancies for CS Applications"))
            {
            	url="/CSStudentVacancies.jsp";
            }
            if (action.equals("Setup Student Vacancies for EE Applications"))
            {
            	url="/EEStudentVacancies.jsp";
            }
            List<String>applications;
                 if(action.equals("Send Email to Selected ME Students")||action.equals("Send Email to Selected EE Students")||action.equals("Send Email to Selected CS Students"))          
                 {
                	 StudentStatusDao status=new StudentStatusDao();
                	 applications=StudentStatusDao.getDeptID("selected", Dept);
                 SendEmail email=new SendEmail();
                 for(int i=0;i<applications.size();i++)
                 {
                	email.sendtomail(applications.get(i)); 
                 }
                 url="/AdminHome.jsp";
                 }
                 if(action.equals("Send Email to Rejected ME Students")||action.equals("Send Email to Rejected EE Students")||action.equals("Send Email to Rejected CS Students"))          
                 {
                	 StudentStatusDao status=new StudentStatusDao();
                	 applications=StudentStatusDao.getDeptID("rejected", Dept);
                 SendEmail email=new SendEmail();
                 for(int i=0;i<applications.size();i++)
                 {
                	email.sendtomailreject(applications.get(i)); 
                 }
                 url="/AdminHome.jsp";
                 }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
	}
	

}
