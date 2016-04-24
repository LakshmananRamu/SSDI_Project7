package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.institute.models.Student_profile;

public class Student_profileTest {

	Student_profile user;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCompleted() {
		user.setCompleted(1);
		assertEquals(1, user.getCompleted());
	}

	
}
