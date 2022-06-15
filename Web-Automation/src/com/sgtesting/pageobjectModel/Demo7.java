package com.sgtesting.pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7
{
	public static WebDriver Browser=null;
	public static ActiTimePage Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createProject();
		CreateTask();
		DeleteTask();
		Deleteproject();
		DeleteCustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			Browser=new ChromeDriver();
			Page=new ActiTimePage(Browser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			Browser.get("http://localhost:81/login.do");
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
			Page.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			Page.getFloyOutWindow().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try {
			Page.getclicktask().click();
			Thread.sleep(2000);
			Page.getAddNewClick().click();
			Thread.sleep(2000);
			Page.getnewcustomer().click();
			Thread.sleep(2000);
			Page.getenternewcustomer().sendKeys("Hosa Customer");
			Thread.sleep(2000);
			Page.getcustomerdescription().sendKeys("this is a sample customer");
			Thread.sleep(2000);
			Page.getcreatecustomer().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try {
			Page.getclicktask().click();
			Thread.sleep(1000);
			Page.getAddNewClick().click();
			Thread.sleep(1000);
			Page.getnewproject().click();;
			Thread.sleep(1000);
			Page.getenterprojectname().sendKeys("Hosa project");
			Thread.sleep(1000);
			Page.getcreateproject().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void CreateTask()

	{
		try {
			Page.addnewtask().click();
			Thread.sleep(1000);
			Page.createnewtask().click();
			Thread.sleep(1000);
			Page.getcreatetaskname1().click();
			Thread.sleep(1000);
			Page.getcreatetaskname1().sendKeys("TASK1");
			Thread.sleep(1000);
			Page.getcreatetaskname2().click();
			Thread.sleep(1000);
			Page.getcreatetaskname2().sendKeys("TASK2");
			Thread.sleep(1000);
			Page.createtask().click();
			Thread.sleep(1000);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void DeleteTask() 
	{
		try {
			//Page.getclicktask().click();
			Thread.sleep(1000);
			Page.gcheckboxclick().click();
			Thread.sleep(1000);
			Page.getdeletetask().click();
			Thread.sleep(1000);
			Page.getClickDeleteButton().click();
			Thread.sleep(1000);
			Page.getdeletetaskpermanently().click();
			Thread.sleep(1000);
			
			Thread.sleep(4000);
			Page.gcheckboxclick().click();
			Thread.sleep(1000);
			Page.getdeletetask().click();
			Thread.sleep(1000);
			Page.getClickDeleteButton().click();
			Thread.sleep(1000);
			Page.getdeletetaskpermanently().click();
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void Deleteproject()
	{
		try {
			Page.getclicktask().click();
			Thread.sleep(1000);
			Page.getgearclick1().click();
			Thread.sleep(1000);
			Page.getactionsproj().click();
			Thread.sleep(1000);
			Page.getdeleteproject().click();
			Thread.sleep(1000);
			Page.getdeleteprojpermanently().click();
			Thread.sleep(1000);
			Page.getclickelsewhere().click();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void DeleteCustomer() {
		try {
			Page.getgearclick().click();
			Thread.sleep(1000);
			Page.getactions().click();
			Thread.sleep(1000);
			Page.getdeletecuatomer().click();
			Thread.sleep(1000);
			Page.getdeletepermanently().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void logout()
	{
		try
		{
			Page.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			Browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
