package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomerCreateDeleteProjectDeleteCustomerDemo5 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimiseFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			//oBrowser.manage().window().maximize();

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
			oBrowser.findElement(By.id("username")).sendKeys("admin");Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(500);
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
	private static void createCustomer()
	{
		try
		{
			Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer5");
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
		    Thread.sleep(2000);
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
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Bank");
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click(); Thread.sleep(2000);
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
		    oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
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
		    oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath(" //*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		    Thread.sleep(2000);
			
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
