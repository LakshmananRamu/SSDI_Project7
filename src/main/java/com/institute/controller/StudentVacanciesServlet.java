package com.institute.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.institute.controller.HibernateUtil;
import com.institute.controller.*;
import com.institute.dao.AdminDAO;
import com.institute.dao.*;
import com.institute.models.*;
import com.institute.models.Weightage;
public class StudentVacanciesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doPost(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	SessionFactory sessionfactory =  new Configuration().configure("studentvacancies.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	

	String url="";
	int Dept_ID=0;
    String action = request.getParameter("studentvacancies");
    System.out.println("name"+action);
    if (action.equals("CS Student Vacancies")) 
    {
    	Dept_ID=1;
    }
    if (action.equals("EE Student Vacancies")) 
    {
    	Dept_ID=2;
    }
    if (action.equals("ME Student Vacancies")) 
    {
    	Dept_ID=3;
    }
    if (action.equals("CS Student Vacancies")||action.equals("EE Student Vacancies")||action.equals("ME Student Vacancies")) {
    	
		
		StudentVacancies user = new StudentVacancies();

		

        
        String studentvac = request.getParameter("StudentVacancies");
        String customquestion2 = request.getParameter("StudentCutoff");
        System.out.println(customquestion2);
        if(Dept_ID==1){
        	url="/CSStudentVacancies.jsp";		
        }
        if(Dept_ID==2){
        	url="/EEStudentVacancies.jsp";		
        }
        if(Dept_ID==3){
        	url="/MEStudentVacancies.jsp";		
        }
        
        if(Integer.parseInt(customquestion2)>100)
        {
        	JOptionPane.showMessageDialog(null, "Cutoff is greater than 100", "InfoBox:Error " , JOptionPane.INFORMATION_MESSAGE);
        }
        	
                 
        //check whether user exists in DB 
        else {StudentVacanciesdao.insert_into_db(Dept_ID,Integer.parseInt(studentvac),Integer.parseInt(customquestion2));
        JOptionPane.showMessageDialog(null, "Cutoff created", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        
        url= "/AdminHome.jsp";}  
    }
    
	session.close();
            getServletContext().getRequestDispatcher(url).forward(request, response);


}



}