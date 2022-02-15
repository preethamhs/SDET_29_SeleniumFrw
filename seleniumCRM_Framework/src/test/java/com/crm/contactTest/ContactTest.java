package com.crm.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "smokeTest")
	public void createContactTest() {
		System.out.println("execute createContactTest(SMOKE)");
	}
	
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest(REGRESSION)");
	}
	@Test(groups = "regressionTest")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest(REGRESSION)");
	}

}
