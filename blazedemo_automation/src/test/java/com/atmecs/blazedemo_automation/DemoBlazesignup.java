package com.atmecs.blazedemo_automation;



import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo_assignments.helpers.Dataloader;
import com.atmecs.blazedemo_assignments.helpers.DemoBlazeSignupPage;

public class DemoBlazesignup {

	WebDriver driver;
	
	Properties prop;
	
	DemoBlazeSignupPage blazedemo;
	
	@BeforeTest
	
	public void launchBrowser() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		System.setProperty(Constants.USER_DIR,Constants.CHROME_PATH);
		
		 driver= new ChromeDriver();
		 
		 blazedemo= new DemoBlazeSignupPage(driver);
		  
		 prop= new Properties();
		 
		  Dataloader dl=new Dataloader();
		  
		  prop=dl.Blazeloader();
		  
		driver.get(prop.getProperty("blazeurl"));
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void signup() throws IOException
	
	
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		blazedemo.signupclick(prop.getProperty("signup"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		blazedemo.textbox(prop.getProperty("username"), prop.getProperty("emailid"));
		
		driver.findElement(By.id("sign-password")).sendKeys(prop.getProperty("pwddemo"));
		driver.findElement(By.xpath("//button[@title='register']")).click();
		
		//driver.findElement(By.classname("Sign up")).click();

	}

	
	
	
}
