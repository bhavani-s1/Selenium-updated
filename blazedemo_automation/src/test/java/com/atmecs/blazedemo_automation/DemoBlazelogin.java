package com.atmecs.blazedemo_automation;

//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constants;
//import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo_assignments.helpers.Dataloader;
import com.atmecs.blazedemo_assignments.helpers.DemoBlazeloginPage;


public class DemoBlazelogin {

	DemoBlazeloginPage loginpage;
	WebDriver driver;

	@Test
	
	public void login() throws InterruptedException, IOException {
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
	System.setProperty(Constants.USER_DIR, Constants.CHROME_PATH);
	//System.setProperty(Constants.USER_DIR,Constants.CHROME_PATH);
	
	 driver= new ChromeDriver();
	Properties prop;
	 
	 //FileInputStream ip= new FileInputStream
//("C:\\Users\\bhavani.kore\\Downloads\\eclipse\\blazedemo_automation\\src\\main\\resources\\newfile\\data.properties");
		//prop.load(ip);
	
	//driver.get("https://www.demoblaze.com/");
	
	prop=new Properties();
	
	loginpage=new DemoBlazeloginPage(driver);
	 
	 Dataloader dl=new Dataloader();
	  
	 prop=dl.Blazeloader();
	 
	 driver.get(prop.getProperty("blazeurl"));

	driver.manage().window().maximize();

		//login
	
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		loginpage.UsernameTextbox(prop.getProperty("username1"), prop.getProperty("emailid"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		loginpage.PwdTextbox(prop.getProperty("pwdpath"), prop.getProperty("pwddemo"));
		
		loginpage.loginclick(prop.getProperty("loginclick"));
		
		
		Thread.sleep(2000);
	}
	
	
}

