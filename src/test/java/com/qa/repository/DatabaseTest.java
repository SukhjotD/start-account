package com.qa.repository;

import static org.junit.Assert.*;

import javax.enterprise.inject.Alternative;


import org.junit.Before;
import org.junit.Test;



import com.qa.util.JSONUtil;

@Alternative
public class DatabaseTest {
	
	private DatabaseTest databaseTest;
	private String mock = "{\"firstName\":\"Steve\",\"secondName\":\"Wick\",\"accountNumber\":\"1235\"}";
	private String mockupdate = "{\"firstName\":\"Steve\",\"secondName\":\"Wick\",\"accountNumber\":\"1235\"}";
	private String JSONUtil util;
	
	
	@Before
	public void getUp() {
		
		util = new JSONUtil();
		databaseTest = new DatabaseTest();
		databaseTest.getUtil(util);
		
	}
	
	
	
	
	@Test
	public void testsDeleteAccount() {
		
		
		String actualValue = databaseTest.deleteAccount(1);
		String expectedValue = "{\"comment\"; \"account gone\"}";
		assertEquals(expectedValue, actualValue);
		
		
	}
	
	
	
	
	@Test
	public void testCreateAccount() {
		
		
		String actualValue = databaseTest.createAccount(mock);
		String expectedValue = "{\"comment\"; \"account implemented\"}";
		assertEquals(expectedValue, actualValue);
	
	}
	
	
	
	
	@Test
	public void testsUpdateAccount() {
		String actualValue = databaseTest.updateAccount(1, mockupdate);
		String expectedValue = "{\"comment\"; \"account updated\"}";
		assertEquals(expectedValue, actualValue);
	
	
	}
	
	
	@Test
	public void testsGetAllAccounts() {
		databaseTest.initAccountMap();
		String expected = "{\"1\":{\"firstName\":\"Bill\",\"secondName\":\"Boe\",\"accountNumber\":\"1235\"}}";
		assertEquals(expected, databaseTest.getAccounts());
	
	
}
