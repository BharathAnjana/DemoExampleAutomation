package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancecreateUsersDemo1 {

	public static WebDriver oBrowser=null; 
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateURL();
		login();
		minimiseFlyOutWindow();
		createUsers();
		logout();
		
		loginAsUser1();
		logout();
		
		loginAsUser2();
		logout();
		
		loginAsUser3();
		logout();
		
		login();
	    modifyUsersPassword();
		logout();
		
		loginAsUser1SecondTime();
		logout();
		
		loginAsUser2SecondTime();
		logout();
		
		loginAsUser3SecondTime();
		logout();
		deleteUsers();
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
	private static void createUsers()
	{
		try {
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("User1Demo1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("User1Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			//create user2
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
			oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			//creation user3
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("User3Demo3@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("User3Demo3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1Demo1");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2Demo2");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3Demo3");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("UserDemo");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUsersPassword()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
			
			oBrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void loginAsUser1SecondTime()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1Demo1");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser2SecondTime()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2Demo2");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
			//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser3SecondTime()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3Demo3");Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome");Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();Thread.sleep(4000);
			//oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[2]")).click();Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUsers()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oalert=oBrowser.switchTo().alert();
			String str=oalert.getText();
			System.out.println(str);
			oalert.accept();
			Thread.sleep(2000);Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oalert2=oBrowser.switchTo().alert();
			String str2=oalert2.getText();
			System.out.println(str2);
			oalert2.accept();
			Thread.sleep(2000);Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oalert3=oBrowser.switchTo().alert();
			String str3=oalert3.getText();
			System.out.println(str3);
			oalert3.accept();
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
