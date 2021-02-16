package com.myStore.base;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.myStore.pageObjects.IndexPage;
import com.myStore.pageObjects.LoginPage;
import com.myStore.utils.ReadConfigProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static Properties prop;
	public static WebDriver driver;
	public IndexPage indexPage;
	public LoginPage loginPage;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		prop = ReadConfigProperties.ReadConfigPropertiesFile();
		System.out.println("Launching test in "+browser+" browser..");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please provide correct browser.."+browser);
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		indexPage = new IndexPage();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
