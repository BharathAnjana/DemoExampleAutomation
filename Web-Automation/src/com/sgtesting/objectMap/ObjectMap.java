package com.sgtesting.objectMap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap
{
	public static Properties prop=null;
	public ObjectMap(String filename)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filename);
			prop=new Properties();
			prop.load(fin);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
		}
	}
	/*
	 * method:getLocator()
	 * it return By WebElement
	 */
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
		  String locatorDetails=prop.getProperty(logicalname);
		  System.out.println(locatorDetails);
		  String []locator=locatorDetails.split(";");
		  String locatorName=locator[0];
		  String locatorValue=locator[1];
		  
		  switch(locatorName.toLowerCase())
		  {
		  case "id":
			  by=By.id(locatorValue);
			  break;
		  case "name":
			  by=By.name(locatorName);
			  break;
		  case "xpath":
			  by=By.xpath(locatorValue);
			  break;
		  case "linktext":
			  by=By.linkText(locatorValue);
			  break;
		  case "tagName":
			  by=By.tagName(locatorValue);
			  break;
		  case "cssselector":
			  by=By.cssSelector(locatorValue);
			  break;
		  case "classname":
			  by=By.className(locatorValue);
			  break;
		  case "partiallinkText":
			  by=By.partialLinkText(locatorValue);
			  break;
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return by;
	}

}
