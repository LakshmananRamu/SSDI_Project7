package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.institute.controller.*;
import com.institute.dao.*;
import com.institute.models.*;


public class StudentDaoTest {
StudentDao UserDao;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert_into_Student_profile_db() {

		
		SessionFactory sessionfactory =  new Configuration().configure("studentprofile.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = null;
		Long userId = null;
		Student_profile newuser  = null;
		
		try {
			 StudentDao.insert_into_Student_profile_db("Jennifer@uncc", "Cooper", "jenny@yahoo.com", "1234567890",
					"567 Some Lane", "NO 345", "Charlotte");
			
			 newuser =(Student_profile)session.get(Student_profile.class,"Jennifer@uncc");
			 assertNotNull(newuser);
			 assertEquals("Jennifer@uncc", newuser.getEmailid());
			 assertEquals("Cooper", newuser.getSalutation());
			 assertEquals("jenny@yahoo.com", newuser.getFirstname());
			 //assertEquals("2003-06-12 00:09:45", newuser.getUserCreateDate());
		} catch (HibernateException exception) {
			if (transaction != null)
				
			exception.printStackTrace();
		} finally {
			session.close();
		}

	}


	}

