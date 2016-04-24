package com.institute.dao;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.institute.models.Admin;
import com.institute.models.Student_profile;
import com.institute.models.students;


public class StudentDao {
	public static void main(String[] args){
		
		insert_into_db("inandipa@uncc.edu","pass","indra kiran","Male");
		
	
	}

	public static void insert_into_db(String email, String password, String name,String gender) {
		// TODO Auto-generated method stub
		students model = new students();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("student.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		if(session.get(students.class, email )==null){
			model.setEmailid(email);
			model.setPassword(password);
			model.setGender(gender);
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
	
	public static void insert_into_Student_profile_db(String email,String Salutation,String firstname,String lastname,String pref_name,String sex,String dob) {
		// TODO Auto-generated method stub
		Student_profile model = new Student_profile();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
	
		if (session.get(Student_profile.class, email )==null) {
			model.setEmailid(email);
			
		}
		else{
			model=session.get(Student_profile.class, email );
		}
			
			model.setFirstname(firstname);;
			model.setLastname(lastname);
			
			model.setSex(sex);
			model.setDob(dob);
			model.setSalutation(Salutation);
			model.setPrefname(pref_name);
			session.save(model);
			System.out.println("value stored in Db");
		
		session.getTransaction().commit();
		session.close();
		
	}

	public static void insert_into_Student_contactinfo_db(String email,String country,String add1,String add2,String city,String state,String postal,String phone) {
		// TODO Auto-generated method stub
		Student_profile model = new Student_profile();
		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		model=session.get(Student_profile.class, email );
		model.setAdd1(add1);
		model.setAdd2(add2);
		model.setPhone(phone);
		model.setCity(city);
		model.setCountry(country);
		model.setPostal(postal);
		model.setState(state);
		session.save(model);
		System.out.println("value stored in Db");
		session.getTransaction().commit();
		session.close();
		
	}	
	public  students check_for_email_password(String mailid){
		
		students model = new students();
		SessionFactory sessionfactory =  new Configuration().configure("student.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		/*String hql = " FROM studentlogindetails u WHERE u.Emailid = :emailId";
		Query query = session.createQuery(hql);
		query.setParameter("emailId",mailid);
		@SuppressWarnings("unchecked")
		List<students> resultList = query.list();
		
		if (resultList.isEmpty()) {
			System.out.println("user not registered");
			return null;
		} else {
			model = resultList.get(0);
			System.out.println("User exisits");
		}
		*/
		if(session.get(students.class, mailid )==null){
			return null;
		}
		else{
			model=session.get(students.class, mailid );
			System.out.println("User exisits");
		}
		
		
		session.close();
		return model;
	}

	public static void insert_into_Student_Education_db(String email, double GRE, double TOFEL, double IELTS,
			double GPA,String date1, String date2, String degree, String major ,String college) {
		
		Student_profile model = new Student_profile();
		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model=session.get(Student_profile.class, email );
		model.setGPA(GPA);
		model.setGRE(GRE);
		model.setGrad_from(date1);
		model.setCollege(college);
		model.setGrad_to(date2);
		model.setIELTS(IELTS);
		model.setTOFEL(TOFEL);
		model.setDegree(degree);
		model.setMajor(major);
		System.out.println("value stored in Db");	
		session.getTransaction().commit();
		session.close();
	}

	public static void insert_into_Student_Employer_db(String email, double exp, String emp_status, String pos,
			String con,String firm, int completed) {
		Student_profile model = new Student_profile();
		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model=session.get(Student_profile.class, email );
		
		model.setExp(exp);
		model.setEmp_status(emp_status);
		model.setCon(con);
		model.setPos(pos);
		model.setFirm(firm);
		model.setCompleted(completed);
			
		System.out.println("value stored in Db");	
		session.getTransaction().commit();
		session.close();
	}
		
	public static Student_profile check_for_email( String email){
		Student_profile model = new Student_profile();
		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model=session.get(Student_profile.class, email );
		return model;
	}

	public static List<String> getDeptID(int DeptID) {
Student_profile model = new Student_profile();
		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		String hql="Select firstname from studentprofile";
		Query query = session.createQuery(hql);
		List<String> result=query.list(); 
		//String email="l@uncc.e";
		//model=session.get(Student_profile.class,DeptID);
		
		//String result=model.getFirstname();
			
		//System.out.println("value stored in Db"+result);	
		session.getTransaction().commit();
		session.close();
		return result;	}

}
