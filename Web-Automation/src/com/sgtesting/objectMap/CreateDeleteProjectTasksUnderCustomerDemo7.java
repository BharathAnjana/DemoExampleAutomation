package com.sgtesting.objectMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteProjectTasksUnderCustomerDemo7 {

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
		createProject();
		createTasks();
		deleteTasks();
		deleteProject();
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
			oBrowser.findElement(objectmap.getLocator("createcustomerentercustomername")).sendKeys("Customer7");Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createcustomerclickoncreatecustomer")).click();Thread.sleep(2000);
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
			oBrowser.findElement(objectmap.getLocator("createcustomertasks")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deletecustomer")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonAction")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("toclickondeletebtn")).click();Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("toclickondeletepermanelyoption")).click();Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try 
		{
			Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("createcustomertasks")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("createcustomeraddnew")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickonnewproject")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("givethenameoftheproject")).sendKeys("SBI Bank");
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickoncreatebtntocreateproject")).click(); Thread.sleep(2000);
		  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try 
		{
			Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("createcustomertasks")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickonsettingbtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickonActionbtntodeleteproject")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickondeletebtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("clickonoptiontoacceptdeletepermanentlybtn")).click();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createTasks()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createtasksclickonaddnewtasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksclickoncreatenewtasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksentertaskstextfiled")).sendKeys("WithDraw Process");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksclickoncreatetaskbtn")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(objectmap.getLocator("createtasksclickonaddnewtasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksclickoncreatenewtasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksentertaskstextfiled")).sendKeys("Check Balance");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("tocreatetasksclickoncreatetaskbtn")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTasks()
	{
		try
		{
			Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeletetasksclickontasksbtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeleteclickontasksname")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeleteclickonactionbtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeletetasksclickondeletebtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeletetasksacceptdeletepermanentlybtn")).click();
		    Thread.sleep(2000);
			
		    Thread.sleep(1000);
		    oBrowser.findElement(objectmap.getLocator("fordeleteclickontasksname")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeleteclickonactionbtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeletetasksclickondeletebtn")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(objectmap.getLocator("fordeletetasksacceptdeletepermanentlybtn")).click();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
