package com.atmecs.blazedemo.excels;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup {

	
		WebDriver driver;
		public static Properties properties;
		

		@BeforeMethod
		public void declaration()  {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("https://www.demoblaze.com");
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}

		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
}
