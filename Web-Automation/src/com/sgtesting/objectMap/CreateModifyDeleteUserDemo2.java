package com.sgtesting.objectMap;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteUserDemo2 {

	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{

			filename="F:\\SeleniumAutomation\\Automation\\Web-Automation\\objectMap\\ObjectMap.properties";
			System.setProperty("webdriver.chrome.driver","F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
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
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try {

			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Anjana");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("mbanjana9825@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("AnjanaBajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createusers")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void modifyUser()
	{
		try
		{
			
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserdeleteuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("AnjuBajantri");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void deleteUser()
	{
		try

		{
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("users")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserdeleteuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(2000);
			Alert oalert=oBrowser.switchTo().alert();
			String str=oalert.getText();
			System.out.println(str);
			oalert.accept();
			Thread.sleep(2000);Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void closeApplication()
	{
		try
		{

			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
