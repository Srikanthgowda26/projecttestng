package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	//protected WebDriver driver;
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		// Set system property to the location of the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path_to_chromedriver/chromedriver.exe");

		// Initialize ChromeDriver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		// Quit the WebDriver instance
		/*if (driver != null) {
			driver.quit();
		}*/
	}
}

