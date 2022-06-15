package com.sgtesting.pageobjectModel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvanceDemo2
{

	public static WebDriver Browser=null;
	public static ActiTimePage Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();minimizeFlyOutWindow();
		createuser1(); logout();
		loginuser1(); createuser2(); logout();
		loginuser2(); createuser3(); logout();
		loginuser3(); logout();
		loginuser2WithoutFluOutWimdow(); modifyPasswordUser3(); logout();
		loginuser3SecondTime(); logout();
		loginUser1WithoutFlyOutWindow(); modifyPasswordUser2(); logout();
		loginuser2SecondTime(); logout();
		login(); modifyPasswordUser1(); logout();
		loginuser1SecondTime(); logout();
		loginuser2SecondTime();DeleteUser3();logout();
		loginuser1SecondTime(); DeleteUser2(); logout();
		login(); DeleteUser1(); logout();
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

	private static void createuser1() 
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
			Thread.sleep(1000);

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
			Thread.sleep(3000);
		}catch(Exception e)
		{
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
	private static void createuser2() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
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
			Thread.sleep(1000);

		} catch (Exception e) {
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
	private static void createuser3() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
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
	private static void loginuser2WithoutFluOutWimdow()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			//	Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyPasswordUser3() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser3SecondTime()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy3User3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getLogin().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser1WithoutFlyOutWindow()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			//Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPasswordUser2()  
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser2SecondTime()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy2User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getLogin().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyPasswordUser1() 
	{
		try {
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getpwd().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getpasswordCopy().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser1SecondTime()
	{
		try
		{
			Page.getUserName().sendKeys("Dummy1User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser");
			Thread.sleep(1000);
			Page.getLogin().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteUser3()
	{
		try 
		{
			Thread.sleep(3000);
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert s=Browser.switchTo().alert();
			String cont=s.getText();
			System.out.println(cont);
			s.accept();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteUser2()  
	{
		try
		{
			Page.getuser().click();
			Thread.sleep(1000);
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteUser1() 
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
			Thread.sleep(2000);

		} catch (Exception e) {
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
