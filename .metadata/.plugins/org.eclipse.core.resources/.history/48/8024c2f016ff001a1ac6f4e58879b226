package com.atmecs.dataprovider;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationsite_demo.constants.Constants;

public class AutomationsiteDataprovider {

	WebDriver driver;
	
	
	
@BeforeMethod

public void LaunchBrowser() {
	
	System.setProperty(Constants.USER_DIR,Constants.CHROME_PATH);
	
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
}


@DataProvider

public void getTestData()
{
	
	
	
	
}

@Test

public void RegistrationTest(String FirstName, String LastName ,String Address,String Email,String phno ) {
	
	
	//firstName
	
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("FirstName");
	
	//lastName
	
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("LastName");

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Address	
	driver.findElement
    (By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Address");
	
	
  //textarea[@class='form-control ng-pristine ng-valid ng-touched']
	//email
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	driver.findElement(By.xpath
("//input[@ng-model='EmailAdress']")).sendKeys("Email");

//phone

driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7702101526");

	
	
}
@AfterMethod

public void closeBrowser()
{
	driver.close();
	
}
}
