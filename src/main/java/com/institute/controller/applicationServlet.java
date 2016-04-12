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

import com.institute.controller.HibernateUtil;
import com.institute.controller.loginServlet;

import com.institute.dao.AdminDAO;
import com.institute.models.Admin;

@WebServlet("/applicationServlet")
public class applicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public applicationServlet() {
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
		
		String url="";
		int Dept_ID=0;
        HttpSession session = request.getSession();
        String action = request.getParameter("application");
        System.out.println("name"+action);
        if (action == null) {
            url = "/newapplication.jsp";
        }
        if (action.equals("cancel")) {
            url = "/AdminHome.jsp";
        }
        if (action.equals("Create CS Application form")||action.equals("Edit CS Application form")) 
        {
        	Dept_ID=1;
        }
        if (action.equals("Create EE Application form")||action.equals("Edit EE Application form")) 
        {
        	Dept_ID=2;
        }
        if (action.equals("Create ME Application form")||action.equals("Edit ME Application form")) 
        {
        	Dept_ID=3;
        }
        if (action.equals("Create CS Application form")||action.equals("Create EE Application form")||action.equals("Create ME Application form")) {
        	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session1 = sessionFactory.openSession();
			Transaction transaction = null;

			
			Admin user = new Admin();

			try {
				transaction = session1.beginTransaction();
								String hql1 = "Delete FROM Admin u WHERE u.DeptId =:DeptID ";
				Query query1 = session1.createQuery(hql1);
				query1.setParameter("DeptID", Dept_ID);
				query1.executeUpdate();
			} catch (HibernateException exception) {
				if (transaction != null)
					transaction.rollback();
				exception.printStackTrace();
			} finally {
				session1.close();
			}
            String custom = request.getParameter("custom_sections");
            String customquestion1 = request.getParameter("custom_question_1");
            String customquestion2 = request.getParameter("custom_question_2");
            String customquestion3 = request.getParameter("custom_question_3");
            String customquestion4 = request.getParameter("custom_question_4");
            String customquestion5 = request.getParameter("custom_question_5");
            System.out.println(customquestion1);
            //check whether user exists in DB 
            AdminDAO.createUser(Dept_ID,custom,customquestion1,customquestion2,customquestion3,customquestion4,customquestion5);
            JOptionPane.showMessageDialog(null, "Application created", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        	
            url= "/AdminHome.jsp";  
        }
        if (action.equals("Edit CS Application form")||action.equals("Edit EE Application form")||action.equals("Edit ME Application form")) {
            	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session1 = sessionFactory.openSession();
			Transaction transaction = null;

			
			Admin user = new Admin();

			try {
				transaction = session1.beginTransaction();
								String hql1 = "Delete FROM Admin u WHERE u.DeptId =:DeptID ";
				Query query1 = session1.createQuery(hql1);
				query1.setParameter("DeptID", Dept_ID);
				query1.executeUpdate();
			} catch (HibernateException exception) {
				if (transaction != null)
					transaction.rollback();
				exception.printStackTrace();
			} finally {
				session1.close();
			}
            String custom = request.getParameter("custom_sections");
            String customquestion1 = request.getParameter("custom_question_1");
            String customquestion2 = request.getParameter("custom_question_2");
            String customquestion3 = request.getParameter("custom_question_3");
            String customquestion4 = request.getParameter("custom_question_4");
            String customquestion5 = request.getParameter("custom_question_5");
            System.out.println(customquestion1);
            //check whether user exists in DB 
            AdminDAO.createUser(Dept_ID,custom,customquestion1,customquestion2,customquestion3,customquestion4,customquestion5);
            JOptionPane.showMessageDialog(null, "Application Succesfully Edited", "InfoBox:Success " , JOptionPane.INFORMATION_MESSAGE);
        	
            url= "/AdminHome.jsp";  
        }
            getServletContext().getRequestDispatcher(url).forward(request, response);
	
	


}

	
}
