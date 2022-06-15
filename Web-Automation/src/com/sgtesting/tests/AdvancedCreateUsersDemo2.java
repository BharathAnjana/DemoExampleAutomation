package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCreateUsersDemo2 {

	public static WebDriver obrowser=null; 
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		Login();minimiseFlyOutWindow();
		createuser1(); logout();
		Loginuser1(); createuser2(); logout();
		Loginuser2(); createuser3(); logout();
		Loginuser3(); logout();
		Loginuser2WithOutWelcomeScreen(); modifyuser3(); logout();
		Loginuser3WithOutWelcomeScreen(); logout();
		Loginuser1WithOutWelcomeScreen(); modifyuser2(); logout();
		LoginUser2AfterModifyPassword();  logout();
		Login(); modifyuser1(); logout();
		LoginUser1AfterModifyPassword();  logout();
		LoginUser2AfterModifyPassword(); Deleteuser3();  logout();
		LoginUser1AfterModifyPassword();Deleteuser2(); logout();
		Login(); Deleteuser1(); logout();
		closeapp();
		

	}
	private static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate() {
		try {
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
	}
	private static void Login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimiseFlyOutWindow()
	{
		try
		{
			Thread.sleep(2000);
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("User1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("User1Demo1@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("User1Demo1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void Loginuser1() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1Demo1");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("User2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("email")).sendKeys("User2Demo2@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser2() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("User3Demo3@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser2WithOutWelcomeScreen() 
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3WithOutWelcomeScreen() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser1WithOutWelcomeScreen() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1Demo1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void LoginUser2AfterModifyPassword() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("Demo2User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("UserDemo1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("UserDemo1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void LoginUser1AfterModifyPassword() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1Demo1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("UserDemo1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deleteuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo2, User2']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo3, User3']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//span[text()='Demo1, User1']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} private static void closeapp() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
