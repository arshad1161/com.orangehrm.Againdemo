package com.orangehrm.Againdemo.TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.Againdemo.base.TestBase;
import com.orangehrm.Againdemo.pages.login_page_hrm;
import com.orangehrm.Againdemo.utility.Utility;

public class TC_001 extends TestBase
{
	login_page_hrm page;
	
	@BeforeTest
	public void setup()
	{
		browsersetup();
		page=new login_page_hrm();
	}
	
	@Test(priority = 2)
	public void validate_title()
	{
		String title= page.vertifytitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority = 1)
	public void validate_url()
	{
		String url=page.verifyURL();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/");
	}
	@Test(priority = 3)
	public void validate_login()
	{
		page.login("Admin", "admin123");
		Utility.screenshot();
	}
	
	@AfterTest
	public void tearup()
	{
		driver.close();
	}

}
