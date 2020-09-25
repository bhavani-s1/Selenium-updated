package com.atmecs.blazedemo_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoBlazeContactus {

	WebDriver driver;
	
	Properties prop;
	@Test
	public void contactUs() throws IOException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		 //properties file object
		 
		 
		 FileInputStream ip= new FileInputStream("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\blazedemo_automation\\src\\main\\resources\\newfile\\config.Properties");
			prop.load(ip);
		 
		 prop= new Properties();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
    	
    	driver.findElement(By.id("recipient-email")).sendKeys(prop.getProperty("emailid"));
    	
    	driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys(prop.getProperty("name"));
    	
    	driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("message");
    	
    	driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver,2);
    	
    	wait.until(ExpectedConditions.alertIsPresent());
    	
    	   String alertmsg=driver.switchTo().alert().getText();
    	
    	   System.out.println(alertmsg);
    	driver.switchTo().alert().accept();

			//Alert alert=driver.switchTo().alert();
			
    }
	
	
}
	
	

