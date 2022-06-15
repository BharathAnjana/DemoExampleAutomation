package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteUserDemo2 {

	public static WebDriver oBrowser=null; 
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateURL();
		login();
		minimiseFlyOutWindow();
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
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();

		}catch(Exception e)
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimiseFlyOutWindow()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("User2Demo2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("User2Demo2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("User2Demo2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2Demo2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(2000);	
			oBrowser.findElement(By.name("username")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("UserUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
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
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
