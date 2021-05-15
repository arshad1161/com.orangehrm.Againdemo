package com.orangehrm.Againdemo.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.Againdemo.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	FileInputStream fis;
	public Properties pro;
	public static WebDriver driver;
	
	public TestBase()
	{
		try
		{
		fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\com.orangehrm.Againdemo\\src\\main\\java\\com\\orangehrm\\Againdemo\\config\\configuration.properties");
		pro= new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
		
	public void browsersetup()
	{
		String browser=pro.getProperty("browsername");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Given Browsername is wrong");
		}
		driver.get(pro.getProperty("url"));
		
	}
		
	}



