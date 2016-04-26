package com.institute.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.institute.models.*;
import com.institute.models.StudentWeightage;
import com.institute.dao.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class AppList extends HttpServlet {
	
	private String revstring;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		 String url = "";
		
		 String action = request.getParameter("action");
		 String dept = request.getParameter("dept");
		 int deptid=0;
		 if(dept.equals("1"))
		 {
			 deptid=1;
		 }
		 if(dept.equals("2"))
		 {
			 deptid=2;
		 }
		 if(dept.equals("3"))
		 {
			 deptid=3;
		 }
		
		 System.out.println("abc"+action);
		 
		 SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			
			Student_profile user = new Student_profile();

			
								String hql1 = "Select Emailid FROM studentprofile u WHERE u.firstname =:DeptID ";
				Query query1 = session.createQuery(hql1);
				query1.setParameter("DeptID", action);
				List<String> result=query1.list();
				session.getTransaction().commit();
    			session.close();
    			SessionFactory sessionfactory1 =  new Configuration().configure("studentweightage.cfg.xml").buildSessionFactory();
    			Session session1 = sessionfactory1.openSession();
    			session1.beginTransaction();
    		
    			StudentWeightage student=new StudentWeightage();
				student=StudentWeightageDao.getDeptID(result.get(0),deptid);
				StudentStatus status=new StudentStatus();
				StudentStatusDao status1=new StudentStatusDao();
				status=status1.getstatus(result.get(0),deptid);
				int GPA=student.getGPA();
				int GRE=student.getGRE();
				int IELTS=student.getIELTSorTOEFL();
				int Work=student.getWorkExperience();
				int custom=student.getCustomQuestions();
				int degree=student.getBachelorsDegree();
				int total=degree+Work+IELTS+custom+GPA+GRE;
				String result1=status.getStatus();
				System.out.println("abc"+result1);
	
				if(result1==null){
					JOptionPane.showMessageDialog(null,"Did not Apply","InfoBox:Status " , JOptionPane.INFORMATION_MESSAGE);
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "<html>"+"<h1> Name :"+action+"</h1></br><h2>Weightage Sections</h2></br><b>GPa</b> : "+GPA+"<br> <b>GRE</b> : "+GRE+"<br> <b>IELTSorTOEFL</b> : "+IELTS+"<br> <b>Work Experience</b> : "+Work+"<br> <b>Custom Questions</b> : "+custom+"<br> <b>Bachelor's Degree</b> : "+degree+"<br> <b>Total Weightage</b> : "+total+"<br> <b>Status</b> : "+result1+"</html>", "InfoBox:Status " , JOptionPane.INFORMATION_MESSAGE);
	            		
				}
				request.setAttribute("msg", "Application already exists");
                url = "/applications.jsp";
                session1.getTransaction().commit();
    			session1.close();
    			getServletContext().getRequestDispatcher(url).forward(request, response);
    			
		}

}
