package com.sgtesting.objectMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteCustomer5 {

	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyoutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		lagout();
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

		}
		catch(Exception e)
		{
			e.printStackTrace();		

		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}
		catch(Exception e)
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
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void lagout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();

			Thread.sleep(2000);
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


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomertasks")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomeraddnew")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomernewcustomer")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomerentercustomername")).sendKeys("Customer4");Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomerclickoncreatecustomer")).click();Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyCustomer()
	{
		try
		{
			Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("createcustomertasks")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("modifycustomerclickonsetting")).click();
		    Thread.sleep(2000);
		   oBrowser.findElement(objectmap.getLocator("clickonnameofthecustomer")).click();
		   Thread.sleep(2000);
		   oBrowser.findElement(objectmap.getLocator("clearnameofthecustomer")).clear();
		   Thread.sleep(2000);
		   oBrowser.findElement(objectmap.getLocator("clearnameofthecustomer")).sendKeys("Customer");
		   Thread.sleep(2000);
		   oBrowser.findElement(objectmap.getLocator("clicksomewhereonscreen")).click();
		   Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();  
		}
	}

	private static void deleteCustomer()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("aftermodificationclickonactionbtn")).click();Thread.sleep(2000);
		oBrowser.findElement(objectmap.getLocator("clickondeletebtnaftermodifiction")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("aftermodificationdeletepermanetly")).click();Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
