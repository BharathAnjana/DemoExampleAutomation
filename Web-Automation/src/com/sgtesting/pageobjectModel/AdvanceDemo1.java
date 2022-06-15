package com.sgtesting.pageobjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceDemo1
{
	public static WebDriver Browser=null;
	public static ActiTimePage Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();minimizeFlyOutWindow();
		createuser();  logout();
		loginuser1(); logout();
		loginuser2(); logout();
		loginuser3(); logout();
		login();
		modifyuser();  logout();
		loginuser11(); logout();
		loginuser22(); logout();
		loginuser33(); logout();
		login();
		Deleteusers(); 
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
	private static void createuser() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("dummy1");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user1");
			Thread.sleep(1000);
			Page.getemail().sendKeys("dummy1user1@gmail.com");
			Thread.sleep(1000);
			Page.getusername().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(3000);
			
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("dummy2");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user2");
			Thread.sleep(1000);
			Page.getemail().sendKeys("dummy2user2@gmail.com");
			Thread.sleep(1000);
			Page.getusername().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(3000);
			
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("dummy3");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("user3");
			Thread.sleep(1000);
			Page.getemail().sendKeys("dummy3user3@gmail.com");
			Thread.sleep(1000);
			Page.getusername().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);



		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void loginuser1()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void loginuser2()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser3()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy1User11");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy1User11");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(4000);
			
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy2User22");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy2User22");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);
			
			Thread.sleep(4000);
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("Dummy3User33");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("Dummy3User33");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);


			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void loginuser11()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy1User11");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser22()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy2User22");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void loginuser33()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy3User33");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Deleteusers() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(4000);
			
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert oalert =  Browser.switchTo().alert();
			String str=oalert.getText();
			System.out.println(str);
			oalert.accept();
			Thread.sleep(2000);
			
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert s=Browser.switchTo().alert();
			String cont=s.getText();
			System.out.println(cont);
			s.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	private static void logout()
	{
		try
		{
			Thread.sleep(1000);
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
