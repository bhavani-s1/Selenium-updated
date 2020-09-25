package com.atmecs.goibibo_automation.helper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTripBookingPage {

	WebDriver driver;
	
	Properties prop;
	
	public MyTripBookingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void signupclick(String xpath) {
		
		WebElement signin=driver.findElement(By.xpath(xpath));
		
	signin.click();
	}
	
	
	public void fbclick(String xpath) {
		
		WebElement facebook =driver.findElement(By.xpath(xpath));

		facebook.click();
	}
	
}
