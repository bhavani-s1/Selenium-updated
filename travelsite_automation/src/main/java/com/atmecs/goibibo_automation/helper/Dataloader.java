package com.atmecs.goibibo_automation.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.travelsite.constants.Constants;

public class Dataloader {

		WebDriver driver;
		Properties prop;

		public Properties Blazeloader() throws IOException  {
			
		FileInputStream locator = new FileInputStream(System.getProperty("user.dir") + Constants.LOCATORS);
		
		prop = new Properties(); 					
		prop.load(locator); 
		
		return prop;
		
		}

	}

	
	
	

