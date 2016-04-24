package com.institute.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.institute.models.*;

public class StudentStatusDao {
	public static List<String> getDeptID(String DeptID,int dept) {
		SessionFactory sessionfactory =  new Configuration().configure("studentstatus.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		
		StudentStatus user = new StudentStatus();
String user1="";
			String hql = "Select emailid FROM student_status u WHERE u.Status =:DeptID and u.DeptId=:dept ";
			Query query = session.createQuery(hql);
			query.setParameter("DeptID", DeptID);
			query.setParameter("dept", dept);
			
		List<String> resultList = query.list();
			
			session.getTransaction().commit();
			session.close();

		return resultList;
	}

	public static StudentStatus getstatus(String DeptID) {
		SessionFactory sessionfactory =  new Configuration().configure("studentstatus.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		
		StudentStatus user = new StudentStatus();
String user1="";
			String hql = "FROM student_status u WHERE u.emailid=:DeptID ";
			Query query = session.createQuery(hql);
			query.setParameter("DeptID", DeptID);
			
		List<StudentStatus> resultList = query.list();
			user=resultList.get(0);
			session.getTransaction().commit();
			session.close();

		return user;
	}



}
