package com.sgtesting.objectMap;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedDemo2
{
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigateURL();
		login();minimizeFlyoutWindow();
		createuser1(); lagout();
		Loginuser1(); createuser2(); lagout();
		Loginuser2(); createuser3(); lagout();
		Loginuser3(); lagout();
		Loginuser2WithOutWelcomeScreen(); modifyuser3(); lagout();
	    Loginuser3WithOutWelcomeScreen(); lagout();
		Loginuser1WithOutWelcomeScreen(); modifyuser2(); lagout();
		LoginUser2AfterModifyPassword();  lagout();
		login(); modifyuser1(); lagout();
		LoginUser1AfterModifyPassword();  lagout();
		LoginUser2AfterModifyPassword(); Deleteuser3();  lagout();
		LoginUser1AfterModifyPassword();Deleteuser2(); lagout();
		login(); Deleteuser1(); lagout();
		closeApplication();
		

	}
	private static void launchbrowser()
	{
		try {

			filename="F:\\SeleniumAutomation\\Automation\\Web-Automation\\objectMap\\ObjectMap.properties";
			System.setProperty("webdriver.chrome.driver","F:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			
		} catch (Exception e) {
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
	private static void createuser1() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("User1Demo1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("User1Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusers")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void Loginuser1() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenvideo")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Demo2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("User2Demo2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusers")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenvideo")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserfirstname")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlastname")).sendKeys("Demo3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("useremail")).sendKeys("User3Demo3@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("usernamefield")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createusers")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenvideo")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser2WithOutWelcomeScreen() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("Demo2User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() {
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user3Modificationclick")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3WithOutWelcomeScreen() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("Demo3User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser1WithOutWelcomeScreen() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1Demo1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user2modificationclick")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();}
		
	}
	private static void LoginUser2AfterModifyPassword() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("Demo2User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser1() {
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user1modificationclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpassword")).sendKeys("UserDemo1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpasswordcopy")).sendKeys("UserDemo1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createusersavebtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void LoginUser1AfterModifyPassword() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1Demo1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("UserDemo1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deleteuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user2modificationclick")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(1000);
			Alert xalert = oBrowser.switchTo().alert();
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
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user3Modificationclick")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(1000);
			Alert xalert = oBrowser.switchTo().alert();
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
			oBrowser.findElement(objectmap.getLocator("users")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("user1modificationclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deletebtn")).click();
			Thread.sleep(2000);
			Alert xalert = oBrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 

}
