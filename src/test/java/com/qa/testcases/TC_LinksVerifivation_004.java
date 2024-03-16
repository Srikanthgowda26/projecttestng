package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTestClass;
import com.qa.pages.HomePage;

public class TC_LinksVerifivation_004 extends BaseTestClass{
	
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	

	@Test(priority =2)
	public void test2() {
		HomePage hp =new HomePage(driver);
		hp.verifyLinks();
		
		int expectedliks=95;
		System.out.println("expected links = "+expectedliks);
		int actuallinks=hp.linksCount();
		System.out.println("actual links = "+actuallinks);
		
		Assert.assertEquals(actuallinks, expectedliks);
		
		
	}
	@Test(priority =3)
	public void test3() {
		HomePage hp =new HomePage(driver);
		int display=hp.displayLinks();
		System.out.println("The display links count = "+display);
	}
}
