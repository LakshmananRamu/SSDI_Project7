package com.institute.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.institute.controller.HibernateUtil;
import com.institute.models.StudentWeightage;

public class StudentWeightageDao {
	public static void main(String[] arg) {
		
		

	}
	public static StudentWeightage getDeptID(String DeptID,int dept) {
		SessionFactory sessionfactory =  new Configuration().configure("studentweightage.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		
		StudentWeightage user = new StudentWeightage();

			String hql = " FROM student_weightage u WHERE u.Studentid =:DeptID and DeptID=:dept ";
			Query query = session.createQuery(hql);
			query.setParameter("DeptID", DeptID);
			query.setParameter("dept", dept);
			
		List<StudentWeightage> resultList = query.list();
			if (!(resultList.isEmpty()))
			{
				user = resultList.get(0);
			}
			session.getTransaction().commit();
			session.close();

		return user;
	}

}
