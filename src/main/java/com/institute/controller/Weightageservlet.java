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
import com.institute.controller.loginServlet;
import com.institute.dao.AdminDAO;
import com.institute.dao.WeightageDao;
import com.institute.models.Admin;
import com.institute.models.Weightage;
public class Weightageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doPost(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	SessionFactory sessionfactory =  new Configuration().configure("weightage.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	

	String url="";
	int Dept_ID=0;
    String action = request.getParameter("Weightage");
    System.out.println("name"+action);
    if (action == null) {
        url = "/newapplication.jsp";
    }
    if (action.equals("cancel")) {
        url = "/AdminHome.jsp";
    }
    if (action.equals("CS Weightage")) 
    {
    	Dept_ID=1;
    }
    if (action.equals("EE Weightage")) 
    {
    	Dept_ID=2;
    }
    if (action.equals("ME Weightage")) 
    {
    	Dept_ID=3;
    }
    if (action.equals("CS Weightage")||action.equals("EE Weightage")||action.equals("ME Weightage")) {
    	
		
		Weightage user = new Weightage();

		

        String custom = request.getParameter("GPA");
        String customquestion1 = request.getParameter("GRE");
        String customquestion2 = request.getParameter("IELTSorTOEFL");
        String customquestion3 = request.getParameter("WorkExperience");
        String customquestion4 = request.getParameter("CustomQuestions");
        String customquestion5 = request.getParameter("BachelorsDegree");
        System.out.println(customquestion1);
        if(Integer.parseInt(custom)+Integer.parseInt(customquestion1)+Integer.parseInt(customquestion2)+Integer.parseInt(customquestion3)+Integer.parseInt(customquestion4)+Integer.parseInt(customquestion5)>100)
        {
        	JOptionPane.showMessageDialog(null, "Total weightage is greater than 100", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        url="/CSWeightage.jsp";		
        }
        else if(Integer.parseInt(custom)+Integer.parseInt(customquestion1)+Integer.parseInt(customquestion2)+Integer.parseInt(customquestion3)+Integer.parseInt(customquestion4)+Integer.parseInt(customquestion5)<100)
        {
        	JOptionPane.showMessageDialog(null, "Total weightage is lesser than 100", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        url="/CSWeightage.jsp";		
        }
         
        //check whether user exists in DB 
        else {WeightageDao.createUser(Dept_ID,Integer.parseInt(custom),Integer.parseInt(customquestion1),Integer.parseInt(customquestion2),Integer.parseInt(customquestion3),Integer.parseInt(customquestion4),Integer.parseInt(customquestion5));
        JOptionPane.showMessageDialog(null, "Weightage created", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        
        url= "/AdminHome.jsp";}  
    }
    
	session.close();
            getServletContext().getRequestDispatcher(url).forward(request, response);


}



}