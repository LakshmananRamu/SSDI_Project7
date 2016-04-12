package com.institute.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.institute.models.*;

public class DepartmentsDao {
	
	public static int insert_into_cs_db(String email ,int a1,int a2,int a3,int a4,int a5) {
		// TODO Auto-generated method stub
		csdepartment model = new csdepartment();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("csdepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
	
		if (session.get(csdepartment.class, email )==null) {
			model.setEmailid(email);
			}
		else {
			model=session.get(csdepartment.class, email );
			}
			model.setQues1(a1);
			model.setQues2(a2);
			model.setQues3(a3);
			model.setQues4(a4);
			model.setQues5(a5);
			model.setStatus(-1);
			session.save(model);
			System.out.println("value stored in Db");
		
		session.getTransaction().commit();
		session.close();
		return 1;
					
	}

	public static int insert_into_ee_db(String email ,int a1,int a2,int a3,int a4,int a5) {
		// TODO Auto-generated method stub
		eedepartment model = new eedepartment();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("eedepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
	
		if (session.get(eedepartment.class, email )==null) {
			model.setEmailid(email);
		}
		else {
			model=session.get(eedepartment.class, email );
			}
			model.setQues1(a1);
			model.setQues2(a2);
			model.setQues3(a3);
			model.setQues4(a4);
			model.setQues5(a5);
			session.save(model);
			model.setStatus(-1);
			System.out.println("value stored in Db");
		
		session.getTransaction().commit();
		session.close();
		return 1;
		
		
	}
	
	public static int insert_into_me_db(String email ,int a1,int a2,int a3,int a4,int a5) {
		// TODO Auto-generated method stub
		medepartment model = new medepartment();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("medepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
	
		if (session.get(medepartment.class, email )==null) {
			model.setEmailid(email);
		}
		else {
			model=session.get(medepartment.class, email );
			}
			model.setQues1(a1);
			model.setQues2(a2);
			model.setQues3(a3);
			model.setQues4(a4);
			model.setQues5(a5);
			model.setStatus(-1);
			session.save(model);
			System.out.println("value stored in Db");
		
		session.getTransaction().commit();
		session.close();
		return 1;
		
	}

	public static int insert_card_into_ee_db(String email, long card) {
		eedepartment model = new eedepartment();
		SessionFactory sessionfactory =  new Configuration().configure("eedepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(eedepartment.class, email );
		model.setCard(card);
		model.setStatus(0);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
		return 0;
	}
	public static int insert_card_into_cs_db(String email, long card) {
		csdepartment model = new csdepartment();
		SessionFactory sessionfactory =  new Configuration().configure("csdepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(csdepartment.class, email );
		model.setCard(card);
		model.setStatus(0);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
		
		return 0;
	}
	public static int insert_card_into_me_db(String email, long card) {
		medepartment model = new medepartment();
		SessionFactory sessionfactory =  new Configuration().configure("medepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(medepartment.class, email );
		model.setCard(card);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
		
		return 0;
	}

	public static csdepartment search_fro_email_cs(String email) {
		csdepartment model = new csdepartment();
		SessionFactory sessionfactory =  new Configuration().configure("csdepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		System.out.println(email);
		model = session.get(csdepartment.class, email );
	
		System.out.println("search in cs");
	
	session.getTransaction().commit();
	session.close();
		
		return model;
	}
	public static eedepartment search_fro_email_ee(String email) {
		eedepartment model = new eedepartment();
		SessionFactory sessionfactory =  new Configuration().configure("eedepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(eedepartment.class, email );
		System.out.println("search in ee");
	
	session.getTransaction().commit();
	session.close();
		
		return model;
	}
	public static medepartment search_fro_email_me(String email) {
		medepartment model = new medepartment();
		SessionFactory sessionfactory =  new Configuration().configure("medepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(medepartment.class, email );
	
		System.out.println("search in me");
	
	session.getTransaction().commit();
	session.close();
		
		return model;
	}

	public static void submit_me_db(String email) {
		medepartment model = new medepartment();
		SessionFactory sessionfactory =  new Configuration().configure("medepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(medepartment.class, email );
		model.setStatus(0);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
	}
	public static void submit_cs_db(String email) {
		csdepartment model = new csdepartment();
		SessionFactory sessionfactory =  new Configuration().configure("csdepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(csdepartment.class, email );
		model.setStatus(0);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
	}
	public static void submit_ee_db(String email) {
		eedepartment model = new eedepartment();
		SessionFactory sessionfactory =  new Configuration().configure("eedepartment.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		model = session.get(eedepartment.class, email );
		model.setStatus(0);
		session.save(model);
		System.out.println("value stored in Db");
	
	session.getTransaction().commit();
	session.close();
	}
}
