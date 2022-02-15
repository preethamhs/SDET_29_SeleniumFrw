package com.crm.orgTest;

import org.testng.annotations.Test;

public class OrganizationTest {

	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest==>(SMOKE)"+ System.getProperty("browser"));

	}
	
	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest(REGRESSION)");
	}
	
	@Test(groups = "regressionTest")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest(REGRESSION)");
	}

}
