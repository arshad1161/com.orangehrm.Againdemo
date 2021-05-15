package com.orangehrm.Againdemo.utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.Againdemo.base.TestBase;

public class Utility extends TestBase
{
	public static void max_window()
	{
		driver.manage().window().maximize();
	}
	
	public static void implicitywait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void explicitywait(String path)
	{
		WebDriverWait explicity=new WebDriverWait(driver, 30);
		explicity.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
	}
	public static void screenshot() 
	{
		try 
		{
		File scrrenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrrenshot, new File("C:\\Users\\Admin\\eclipse-workspace\\com.orangehrm.Againdemo\\screenshot\\error"+System.currentTimeMillis()+".png"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
	

}
