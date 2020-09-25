package com.atmecs.phptravels_automationdemo;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.atmecs.chat.helper.ChatWidgetPage;
import com.atmecs.chat.helper.Dataloader;


	public class ChatWidget {

			static WebDriver driver;
			Properties prop;
			ChatWidgetPage chatpage;
			@BeforeTest
			
			public void launch() throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavani.kore\\Drivers\\chromedriver.exe");
				
				driver= new ChromeDriver();
				
				driver.get("https://www.phptravels.com/");
				//driver.get(prop.getProperty("chaturl"));
				
				//scrolling down the page
				
				/*JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				driver.manage().window().maximize();*/
				
			}
			
			@Test
			public void login() throws InterruptedException, IOException {
				
				//driver= new ChromeDriver();
				 
				 chatpage= new ChatWidgetPage(driver);
				  
				 prop= new Properties();
				 
				  Dataloader dl=new Dataloader();
				  
				  prop=dl.Blazeloader();
				  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	     JavascriptExecutor js = (JavascriptExecutor) driver;
				
          driver.switchTo().frame("chat-widget");
          
          WebDriverWait wait = new WebDriverWait(driver,30);
				
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Open LiveChat chat widget']")));
				Thread.sleep(2000);
				
     WebElement chatButton = driver.findElement(By.xpath("//div[@aria-label='Open LiveChat chat widget']"));
				
         js.executeScript("arguments[0].click();", chatButton);
				
         chatpage.nametextbox(prop.getProperty("namexpath"),(prop.getProperty("name")));
			driver.findElement(By.xpath(prop.getProperty("namexpath"))).sendKeys(prop.getProperty("name"));
				//driver.findElement(By.xpath("//input[@id='name']")).sendKeys(prop.getProperty("name"));
				
				Thread.sleep(1000);
			
				WebElement whatsapp=driver.findElement(By.xpath("(//input[@class='lc-1gz7fd7 e1xplv9i0'])[2]"));
				whatsapp.sendKeys(prop.getProperty("phno"));
				
				
				Thread.sleep(2000);
				chatpage.mailtextbox(prop.getProperty("mailidxpath"), prop.getProperty("emailid"));
				//driver.findElement(By.xpath(prop.getProperty("mailidxpath"))).sendKeys(prop.getProperty("emailid"));
				
				//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("k.bhavani6@gmail.com"));
				
		       
				//WebElement choice=driver.findElement(By.xpath("//input[@class='//input[@class='lc-5mlnfz e81sjne0']"));
				
				
				//choice.click();
				
				chatpage.selectdropdown(prop.getProperty("selectxpath"), prop.getProperty("index1_1"));
				//Select choose=new Select(By.xpath(prop.getProperty("selectxpath"))));
				
				WebElement click1= driver.findElement(By.xpath("//button[@class='lc-tf4jp6 esv0owm0']"));
				
				js.executeScript("arguments[0].click();", click1);
				
			}
		       @AfterTest
		       
		       public void close() {
		    	   
		    	   driver.close();
		    	   
		       }
		}

		
		
	



