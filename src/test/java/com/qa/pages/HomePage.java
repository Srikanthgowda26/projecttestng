package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTestClass;

public class HomePage extends BaseTestClass {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy (tagName= "a")
	List<WebElement> links;

	@FindBy (xpath= "//ul[@class='top-menu']/li")
	List<WebElement> mainElements;

	public int linksCount() {
		int toatalLiks=links.size();
		return toatalLiks;
	}

	public int displayLinks() {
		int count=0;
		for(WebElement link:links) {
			if(link.isDisplayed()) {
				count++;
			}
		}	
		return count;
	}

	public void verifyLinks() {
		for (WebElement elements :links){
			System.out.println(elements.getText());
		}
	}
	public int mainElementsCount() {
		int size=mainElements.size();
		return size;

	}
	public void validateElementsText() {
		for (WebElement elements :mainElements){
			System.out.println(elements.getText());
		}
	}

}