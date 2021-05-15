package com.orangehrm.Againdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.Againdemo.base.TestBase;

public class login_page_hrm extends TestBase
{
	@FindBy(xpath = "//div[text()='LOGIN Panel']")
	WebElement loginheadline;
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement forgotpasssword;
	
	
	public login_page_hrm()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String vertifytitle()
	{
		return driver.getTitle();
	}
	
	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void login(String usrname,String pasword)
	{
		username.sendKeys(usrname);
		password.sendKeys(pasword);
		login.click();
	}
	
	
		
	}
	


