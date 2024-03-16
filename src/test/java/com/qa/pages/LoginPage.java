package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTestClass;

public class LoginPage extends BaseTestClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//a[@class='ico-login']")
	WebElement loginLink;

	@FindBy (xpath="//input[@id='Email']")
	WebElement emailField;

	@FindBy (xpath="//input[@id='Password']")
	WebElement passwordField;
	
	@FindBy (xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	@FindBy (xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void loginCredentials(String email,String password) {
		loginLink.click();
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
	}
	
	public void login() {
		loginButton.click();
	}
	
	public String accountVerify() {
		String acc=account.getText();
		return acc;
	}


}
