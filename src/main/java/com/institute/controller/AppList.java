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

import com.institute.models.Student_profile;
import com.institute.models.StudentWeightage;
import com.institute.dao.StudentWeightageDao;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class AppList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		 String url = "";
		
		 String action1 = request.getParameter("action");
		 String action=action1.substring(3, action1.length());
		 System.out.println("abc"+action);
		 System.out.println("abc"+action1);
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
				student=StudentWeightageDao.getDeptID(result.get(0));
				int GPA=student.getGPA();
				int GRE=student.getGRE();
				int IELTS=student.getIELTSorTOEFL();
				int Work=student.getWorkExperience();
				int custom=student.getCustomQuestions();
				int degree=student.getBachelorsDegree();
				int total=degree+Work+IELTS+custom+GPA+GRE;
				JOptionPane.showMessageDialog(null, "<html>"+"<h1> Name :"+action+"</h1></br><h2>Weightage Sections</h2></br><b>GPa</b> : "+GPA+"<br> <b>GRE</b> : "+GRE+"<br> <b>IELTSorTOEFL</b> : "+IELTS+"<br> <b>Work Experience</b> : "+Work+"<br> <b>Custom Questions</b> : "+custom+"<br> <b>Bachelor's Degree</b> : "+degree+"<br> <b>Total Weightage</b> : "+total+"</html>", "InfoBox:Status " , JOptionPane.INFORMATION_MESSAGE);
            	request.setAttribute("msg", "Application already exists");
                url = "/applications.jsp";
                session1.getTransaction().commit();
    			session1.close();
    			getServletContext().getRequestDispatcher(url).forward(request, response);
    			
		}

}
