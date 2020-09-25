package com.atmecs.blazedemo_assignments.helpers;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoBlazeloginPage {

WebDriver driver;
	
	Properties prop;
	
	//constructor
	public DemoBlazeloginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

public void UsernameTextbox(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);

}

public void PwdTextbox(String xpath,String value) {
	
	driver.findElement(By.xpath(xpath)).sendKeys(value);

}
public void loginclick(String xpath) {
	
	driver.findElement(By.xpath(xpath)).click();
	
	
	
}
}

