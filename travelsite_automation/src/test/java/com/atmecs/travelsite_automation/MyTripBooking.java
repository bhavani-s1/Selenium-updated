package com.atmecs.travelsite_automation;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.goibibo_automation.helper.Dataloader;
import com.atmecs.goibibo_automation.helper.MyTripBookingPage;
import com.atmecs.travelsite.constants.Constants;

public class MyTripBooking {

	WebDriver driver;
	MyTripBookingPage mytrip;
	
	Properties prop;
	@BeforeTest
	
	public void launchBrowser() throws IOException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
		
		System.setProperty(Constants.USER_DIR,Constants.CHROME_PATH);
		
		 driver= new ChromeDriver();
		 
		 mytrip= new MyTripBookingPage(driver);
		  
		 prop= new Properties();
		 
		  Dataloader dl=new Dataloader();
		  
		  prop=dl.Blazeloader();
		  
		driver.get(prop.getProperty("url"));
		//driver.get("https://www.goibibo.com/");
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
@Test(priority=1)
	
	public void login1() throws InterruptedException
	{

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

mytrip.signupclick(prop.getProperty("signinxpath"));

	//WebElement signin=driver.findElement(By.xpath("//a[@id='get_sign_in']"));
	
//	signin.click();

	
	//facebook login
	
	driver.switchTo().frame("authiframe");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	mytrip.fbclick((prop.getProperty("FBclickxpath")));
	
	//WebElement facebook =driver.findElement(By.xpath(prop.getProperty("FBclickxpath")));

	//facebook.click();
	
	//WebElement facebook =driver.findElement(By.xpath("//button[@id='authFBSignInBtn']"));

	//facebook.click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String parent=driver.getWindowHandle();
	
	Set<String>s=driver.getWindowHandles();
	
	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();
	while(I1.hasNext())
	{
	String child_window=I1.next();
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
	System.out.println(driver.switchTo().window(child_window).getTitle());
	
	driver.findElement(By.xpath(prop.getProperty("phnoxpath"))).sendKeys(prop.getProperty("phno"));

	driver.findElement(By.xpath(prop.getProperty("pwdxpath"))).sendKeys(prop.getProperty("fbpwd"));
	driver.findElement(By.xpath("//input[@name='login']")).click();
	//driver.close();
	
	}
	}
	driver.switchTo().window(parent);

	}
	
	@Test(priority=2)
	
     public void booking() throws InterruptedException {
		
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	  driver.findElement(By.id("roundTrip")).click();
    	 
    	 WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
    	 
    	 from.sendKeys("hyderabad");
    	 
    	 from.sendKeys(Keys.ARROW_DOWN);
    	 
    	 from.sendKeys(Keys.ENTER);
    	 
    	 Thread.sleep(2000);
    	 
    	 WebElement to= driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
    	 
    	 to.sendKeys("Bengaluru");
    	 
         to.sendKeys(Keys.ARROW_DOWN);
    	 
    	 to.sendKeys(Keys.ENTER);
    	 
    	 Thread.sleep(2000);
   
    driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
    
 //driver.findElement(By.xpath("div[@class='DayPicker DayPicker--en']//div[2]//div[@id='fare_20200918']")).click();
    
WebElement deptDate=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 24 2020')]"));

deptDate.click();

Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='returnCalendar']")).click();
    
  Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 26 2020')]")).click();
    
    Thread.sleep(2000);
    //traveller
    
    driver.findElement(By.xpath("//div[@id='pax_link_common']")).click();
    
    //adults
    
    driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
    
    //class
    
    WebElement travel=driver.findElement(By.xpath("//select[@id='gi_class']"));
    
    Select dw= new Select(travel);
    
    dw.deselectByValue("F");
  //search   
  driver.findElement(By.xpath("//button[@value='Search']")).click();
  
     	 	 
	}

}	

	
	
	

