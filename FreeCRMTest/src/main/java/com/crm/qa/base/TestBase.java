package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	//initializing WebDriver object
	
	public static WebDriver driver;
	static Properties prop;
	
	//Constructor
	
	public TestBase() {
	
	// catching exception for to make sure that error is thrown incase we forgot to metion the path to load the config file	
	try {
		//creating a prop object to load the properties file
		prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/shahgeorge/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		prop.load(ip);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if (browserName=="chrome") {
			System.setProperty("webdriver.chrome.driver", "/Users/shahgeorge/Downloads/chromedriver");	
			driver = new ChromeDriver(); 
			
		} else if (browserName=="firefox") {
			System.setProperty("webdriver.gecko.driver", "/Users/shahgeorge/Downloads/geckodriver");	
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
}
