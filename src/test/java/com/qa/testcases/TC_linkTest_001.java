package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseTestClass;

public class TC_linkTest_001 extends BaseTestClass{
	@Test
	public void linkTest(){
		driver.get("https://demowebshop.tricentis.com/");
	}
}
