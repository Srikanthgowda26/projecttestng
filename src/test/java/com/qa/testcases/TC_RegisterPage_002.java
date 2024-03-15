package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.base.BaseTestClass;
import com.qa.pages.RegisterPage;

public class TC_RegisterPage_002 extends BaseTestClass{
	
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		RegisterPage rp = new RegisterPage(driver);
		rp.registerUser("Test","User1","Testuserhigh12@gmail.com");
		rp.userPassword("User@test","User@test");
		rp.register();
	}
	
	@Test(priority = 3)
	public void validateRegistration() {
		RegisterPage rp = new RegisterPage(driver);
		String actualUser=rp.user();
		System.out.println("actual user name is = "+actualUser);
		String expectedUser=("Testuserhigh12@gmail.com");
		System.out.println("expected user name is = "+expectedUser);
		
		Assert.assertEquals(actualUser,expectedUser);
	}
}
