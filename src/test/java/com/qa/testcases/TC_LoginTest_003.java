package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTestClass;
import com.qa.pages.LoginPage;

public class TC_LoginTest_003 extends BaseTestClass{
	
	public LoginPage lp;
	
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		lp=new LoginPage(driver);
		lp.loginCredentials("Testuserhigh111@gmail.com", "User@test");
		lp.login();
	}
	
	@Test(priority = 3)
	public void validateLogin() {
		lp=new LoginPage(driver);
		String actualUser=lp.accountVerify();
		System.out.println("actual user name is = "+actualUser);
		String expectedUser=("Testuserhigh111@gmail.com");
		System.out.println("expected user name is = "+expectedUser);
		
		Assert.assertEquals(actualUser,expectedUser);
	}
	

}
