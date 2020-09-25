package com.atmecs.blazedemo_assignments.helpers;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoBlazeAddtocartPage {

	WebDriver driver;
	
	Properties prop;
	
	public DemoBlazeAddtocartPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
public void cartclick(String xpath) {
	
	driver.findElement(By.xpath(xpath)).click();
}
	
}
