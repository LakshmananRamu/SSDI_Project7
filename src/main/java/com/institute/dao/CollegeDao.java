package com.institute.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.institute.models.Department;
import com.institute.models.officer;

public class CollegeDao {
public static void main(String[] args){
			
		/*
		  insert_into_department_db("inandipa@uncc.edu","pass","indra");
		insert_into_office_db("inandipa@uncc.edu","pass","kiran");

		insert_into_department_db("lakshman@uncc.edu","pass","lakshman");
		insert_into_office_db("sujitha@uncc.edu","pass","sujitha");
		insert_into_department_db("sujitha@uncc.edu","pass","sujitha");
		insert_into_office_db("shammena@uncc.edu","pass","shammena");
		insert_into_department_db("shammena@uncc.edu","pass","shammena");
	*/
	}
public static void insert_into_office_db(String email, String password, String name) {
	// TODO Auto-generated method stub
	  officer model = new officer();
	SessionFactory sessionfactory =  new Configuration().configure("officer.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	
	String hql = " FROM officerlogindetails u WHERE u.Emailid = :emailId";
	Query query = session.createQuery(hql);
	query.setParameter("emailId",email);
	
	@SuppressWarnings("unchecked")
	List<officer> resultList = query.list();
	if (resultList.isEmpty()) {
		model.setEmailid(email);
		model.setPassword(password);
		model.setName(name);
		session.save(model);
		System.out.println("value stored in Db");
	}
	else{
		System.out.println("user already registered");
	}
	session.getTransaction().commit();
	session.close();


	
}

public  officer check_for_email_password_office(String mailid){
	
	  officer model = new officer();
	SessionFactory sessionfactory =  new Configuration().configure("officer.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	String hql = " FROM officerlogindetails u WHERE u.Emailid = :emailId";
	Query query = session.createQuery(hql);
	query.setParameter("emailId",mailid);

	

	@SuppressWarnings("unchecked")
	List<officer> resultList = query.list();
	
	if (resultList.isEmpty()) {
		System.out.println("user not registered");
		return null;
	} else {
		model = resultList.get(0);
		System.out.println("User exisits");
	}
	session.close();
	return model;
}

public static void insert_into_department_db(String email, String password, String name){
	// TODO Auto-generated method stub
	 Department model = new Department();
	SessionFactory sessionfactory =  new Configuration().configure("Department.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	
	String hql = " FROM departmentlogindetails u WHERE u.Emailid = :emailId";
	Query query = session.createQuery(hql);
	query.setParameter("emailId",email);
	
	@SuppressWarnings("unchecked")
	List<Department> resultList = query.list();
	if (resultList.isEmpty()) {
		model.setEmailid(email);
		model.setPassword(password);
		model.setName(name);
		session.save(model);
		System.out.println("value stored in Db");
	}
	else{
		System.out.println("user already registered");
	}
	session.getTransaction().commit();
	session.close();


	
}

public  Department check_for_email_password_department(String mailid){
	
	 Department model = new Department();
	SessionFactory sessionfactory =  new Configuration().configure("Department.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	session.beginTransaction();
	String hql = " FROM departmentlogindetails u WHERE u.Emailid = :emailId";
	Query query = session.createQuery(hql);
	query.setParameter("emailId",mailid);

	

	@SuppressWarnings("unchecked")
	List<Department> resultList = query.list();
	
	if (resultList.isEmpty()) {
		System.out.println("user not registered");
		return null;
	} else {
		model = resultList.get(0);
		System.out.println("User exisits");
	}
	session.close();
	return model;
}
	
}
