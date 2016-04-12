package com.institute.dao;

	import java.util.List;

	import org.hibernate.HibernateException;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	import com.institute.controller.HibernateUtil;
	import com.institute.models.Admin;
	public class AdminDAO {
		public static void main(String[] arg) {
			
			

		}
		//method for inserting a user record in User table
		public static void createUser(int DeptID,String CustomSections, String CustomQuestion1, String CustomQuestion2, String CustomQuestion3, String CustomQuestion4, String CustomQuestion5 ) {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
			Long userId = null;
			try {
				transaction = session.beginTransaction();
				Admin user = new Admin();
				user.setDeptId(DeptID);
				user.setCustomSection(CustomSections);
				user.setCustomQuestion1(CustomQuestion1);
				user.setCustomQuestion2(CustomQuestion2);
				
				user.setCustomQuestion3(CustomQuestion3);
				user.setCustomQuestion4(CustomQuestion4);
				user.setCustomQuestion5(CustomQuestion5);
				
				System.out.println("User object is set");
				session.save(user);
				
				System.out.println("User saved in DB");

				transaction.commit();

				System.out.println("User insert is committed");
			} catch (HibernateException exception) {
				if (transaction != null)
					transaction.rollback();
				exception.printStackTrace();
			} finally {
				session.close();
			}

			
		}


		//method for retrieving a user record from User table using email address and password
		public static Admin getDeptID(int DeptID) {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = null;

			
			Admin user = new Admin();

			try {
				transaction = session.beginTransaction();
				String hql = " FROM Admin u WHERE u.DeptId =:DeptID ";
				Query query = session.createQuery(hql);
				query.setParameter("DeptID", DeptID);
				
			List<Admin> resultList = query.list();
				if (!(resultList.isEmpty()))
				{
					user = resultList.get(0);
				}
				

			} catch (HibernateException exception) {
				if (transaction != null)
					transaction.rollback();
				exception.printStackTrace();
			} finally {
				session.close();
			}
			return user;
		}

}
