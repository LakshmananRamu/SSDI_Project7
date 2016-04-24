package test;
import com.institute.models.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Studentprofiles {
	Student_profile user;
	@Before
	public void setUp() throws Exception {
		user=new Student_profile();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetFirstname() {
		user.setFirstname("abcd");
		assertEquals("abcd", user.getFirstname());
	}


}
