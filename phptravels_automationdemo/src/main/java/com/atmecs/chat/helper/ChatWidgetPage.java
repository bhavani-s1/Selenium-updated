package com.atmecs.chat.helper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ChatWidgetPage {

WebDriver driver;
	
	Properties prop;
	
	public ChatWidgetPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void nametextbox(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	
public void mailtextbox(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void selectdropdown(String xpath, String value) {
		
	Select choose=new Select(driver.findElement(By.xpath(xpath)));
			
			choose.selectByValue(value);
	}
}
