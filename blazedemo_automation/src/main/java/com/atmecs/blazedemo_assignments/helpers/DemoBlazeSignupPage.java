package com.atmecs.blazedemo_assignments.helpers;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoBlazeSignupPage {

	WebDriver driver;
	
	Properties prop;
	
	//constructor
	public DemoBlazeSignupPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void signupclick(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void textbox(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
}
