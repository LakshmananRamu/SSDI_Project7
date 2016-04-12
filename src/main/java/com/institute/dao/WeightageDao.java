package com.institute.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.institute.controller.HibernateUtil;
import com.institute.models.Admin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.institute.models.Weightage;
import com.institute.models.Student_profile;
import com.institute.models.students;


public class WeightageDao {

	public static void main(String[] arg) {
		
		

	}
public static void createUser(Integer DeptID,Integer GPA,Integer GRE, Integer IELTSorTOEFL, Integer WorkExperience, Integer CustomQuestions, Integer BachelorsDegree) {
	SessionFactory sessionfactory =  new Configuration().configure("weightage.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	
	Long userId = null;
	try {
		String hql = "Delete FROM Weightage u WHERE u.DeptID =:DeptID ";
Query query1 = session.createQuery(hql);
query1.setParameter("DeptID", DeptID);
query1.executeUpdate();
} catch (HibernateException exception) {

exception.printStackTrace();
} finally {

}
		Weightage user = new Weightage();
		user.setDeptID(DeptID);
		user.setGPA(GPA);
		user.setGRE(GRE);
		user.setIELTSorTOEFL(IELTSorTOEFL);
		user.setWorkExperience(WorkExperience);
		
		user.setCustomQuestions(CustomQuestions);
		user.setBachelorsDegree(BachelorsDegree);
		
		System.out.println("User object is set");
		session.save(user);
		
		System.out.println("User saved in DB");

		

		System.out.println("User insert is committed");

	session.getTransaction().commit();
	session.close();
}



}

