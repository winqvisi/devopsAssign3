package com.arcada.devops.assign3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	App myapp;
	
	@Before
	public void setUp() throws Exception {
		myapp = new App();
	}

	@After
	public void tearDown() throws Exception {
		myapp = null;
	}

	@Test
	public void testGetFriendsPositive() {
		String[] result = myapp.getFriends("username");
		
		assertNotNull(result);
		assertEquals(3, result.length);
	}
	
	@Test
	public void testGetFriendsNegative() {
		String[] result = myapp.getFriends("invalid_username");
		
		assertNull(result);
	}
	
	@Test
	public void testGetFriendsNegativeNoFriends() {
		String[] result = myapp.getFriends("nofriends");
		
		assertNotNull(result);
		assertEquals(0, result.length);
	}

}
