package com.institute.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.institute.models.StudentVacancies;

public class StudentVacanciesdao {
	public static void insert_into_db(int deptid, int studentvac, int cutoff) {
		// TODO Auto-generated method stub
		StudentVacancies model = new StudentVacancies();
		
	
		SessionFactory sessionfactory =  new Configuration().configure("studentvacancies.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		String hql = "Delete FROM student_vacancies u WHERE u.Dept_ID =:DeptID ";
		Query query1 = session.createQuery(hql);
		query1.setParameter("DeptID", deptid);
		query1.executeUpdate();
		if(session.get(StudentVacancies.class, deptid )==null){
			System.out.println(deptid+studentvac+cutoff);
			model.setDeptid(deptid);
			model.setStudentVacancies(studentvac);
			model.setCutoff(cutoff);
			session.save(model);
			session.getTransaction().commit();
			session.close();
			System.out.println("value stored in Db");
		}
	
}
}