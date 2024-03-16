package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTestClass;
import com.qa.pages.HomePage;

public class TC_ValidateMainElements_005 extends BaseTestClass{
	
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority =2)
	public void test2() {
		HomePage hp =new HomePage(driver);
		hp.validateElementsText();
	}
	
	@Test(priority = 3)
	public void test3() {
		HomePage hp =new HomePage(driver);
		int actualcount=7;
		System.out.println("actual MainElementsText count is = "+actualcount);
		int expectedcount=hp.mainElementsCount();
		System.out.println("expected MainElementsText count = "+expectedcount);
		
		Assert.assertEquals(actualcount,expectedcount);
	}
	
	
}