package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTestClass;

public class RegisterPage extends BaseTestClass {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//a[@class='ico-register']")
	WebElement registerButton;

	@FindBy (xpath="//input[@id='gender-male']")
	WebElement genderRadio;

	@FindBy (xpath="//input[@id='FirstName']")
	WebElement firstName;

	@FindBy (xpath="//input[@id='LastName']")
	WebElement lastName;

	@FindBy (xpath="//input[@id='Email']")
	WebElement emailId;

	@FindBy (xpath="//input[@id='Password']")
	WebElement password;

	@FindBy (xpath="//input[@id='ConfirmPassword']")
	WebElement confirmPassword;

	@FindBy (xpath="//input[@id='register-button']")
	WebElement registerSubmit;

	/*@FindBy (xpath="//li[text()='The specified email already exists']")
	WebElement confirmationMessage;*/

	@FindBy (xpath="(//a[@class='account'])[1]")
	WebElement account;

	public void registerUser(String first,String last,String email) {
		registerButton.click();
		genderRadio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		emailId.sendKeys(email);
	}

	public void userPassword(String pw,String cp) {
		password.sendKeys(pw);
		confirmPassword.sendKeys(cp);	
	}

	public void register() {
		registerSubmit.click();	

		/*String message = confirmationMessage.getText();

		if (message.contains("Registration successful")) {
			//if (message.contains("The specified email already exists")) {
			System.out.println("Registration successful!");
		} else {
			System.out.println("Registration failed! because of "+message);
		}*/
	}

	public String user() {
		String acc=account.getText();
		return acc;
	}
}

