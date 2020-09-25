package com.atmecs.blazedemo_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlazePlaceOrder {

	WebDriver driver;
	Properties prop;
	@Test
	public void placeOrder() throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
	 driver= new ChromeDriver();
	 
 prop= new Properties();
	 
	 FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\blazedemo_automation\\src\\main\\resources\\newfile\\config.Properties");
		prop.load(ip);
	
		
	driver.get(prop.getProperty("url"));
		
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@id='cartur']")).click();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
 driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(7) div.row div.col-lg-1 > button.btn.btn-success:nth-child(3)")).click();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	  driver.findElement(By.id("name")).sendKeys(prop.getProperty("name"));
  	  driver.findElement(By.id("country")).sendKeys("India");
  	  driver.findElement(By.id("city")).sendKeys("Bangalore");
  	  driver.findElement(By.id("card")).sendKeys("45362527288196");
  	  driver.findElement(By.id("month")).sendKeys("September");
  	  driver.findElement(By.id("year")).sendKeys("2020");
  	  
  	  driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();

			
			
		}
	
	
}
	
	

