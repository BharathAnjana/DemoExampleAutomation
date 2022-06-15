package com.sgtesting.objectMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceDemo1
{
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyoutWindow();
		createUsers();
		modifyUserPassword();
		deleteUser();
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
			oBrowser.close();


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUsers()
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
			
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Pradeep");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("koravarpradeep@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("PradeepKumar");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createusers")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("Vinoda");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Bajantri");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("bajantriVinoda@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("VinodaB");
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
	private static void modifyUserPassword()
	{
		try 
		{
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("users")).click();Thread.sleep(2000);
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserdeleteuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("anjana");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("anjana");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
			
			
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("toclickonUser2Name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("pradeep");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("pradeep");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
			
			
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("toclickonUser3Name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("vinoda");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("vinoda");
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
			
			
			
			oBrowser.findElement(objectmap.getLocator("toclickonUser2Name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(2000);
			Alert oalert1=oBrowser.switchTo().alert();
			String str1=oalert1.getText();
			System.out.println(str1);
			oalert1.accept();
			Thread.sleep(2000);Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("toclickonUser3Name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(2000);
			Alert oalert2=oBrowser.switchTo().alert();
			String str2=oalert2.getText();
			System.out.println(str2);
			oalert2.accept();
			Thread.sleep(2000);Thread.sleep(2000);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	}
