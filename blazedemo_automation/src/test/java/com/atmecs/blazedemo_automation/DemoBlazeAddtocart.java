package com.atmecs.blazedemo_automation;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.constants.Constants;
import com.atmecs.blazedemo_assignments.helpers.Dataloader;
import com.atmecs.blazedemo_assignments.helpers.DemoBlazeAddtocartPage;

public class DemoBlazeAddtocart {

	WebDriver driver;
	DemoBlazeAddtocartPage addtocart;
	Properties prop;
	
	@Test
	public void addToCart() throws IOException 
	
	{	
			
		System.setProperty(Constants.USER_DIR,Constants.CHROME_PATH);
			
			 driver= new ChromeDriver();
			 
			 addtocart= new DemoBlazeAddtocartPage(driver);
			  
			 prop= new Properties();
			 
			  Dataloader dl=new Dataloader();
			  
			  prop=dl.Blazeloader();
			  
		driver.get(prop.getProperty("blazeurl"));
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		
		addtocart.cartclick((prop.getProperty("Addtocart")));
		
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cart')]"))).click();


		
	}
	
}
	
	

