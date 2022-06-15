package com.sgtesting.pageobjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		Modifyuser();
		DeleteUser();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");Thread.sleep(2000);
			oPage.getPassword().sendKeys("manager");Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFloyOutWindow().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			oPage.getuser().click();
			oPage.getadduser().click();
			oPage.getfirstName().sendKeys("test");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("case1");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("testcase1@gmail.com");
			Thread.sleep(2000);
			oPage.getusername().sendKeys("TestCase1");
			Thread.sleep(2000);
			oPage.getpwd().sendKeys("TestCase1");
			Thread.sleep(2000);
			oPage.getpasswordCopy().sendKeys("TestCase1");
			Thread.sleep(2000);
			oPage.getcreateuser().click();	
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try {
			Thread.sleep(2000);
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getusernameclick().click();
			Thread.sleep(2000);
			oPage.getpwd().sendKeys("testcase");
			Thread.sleep(2000);
			oPage.getpasswordCopy().sendKeys("testcase");
			Thread.sleep(2000);
			oPage.getsavechangesclick().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try {
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getusernameclick1().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
