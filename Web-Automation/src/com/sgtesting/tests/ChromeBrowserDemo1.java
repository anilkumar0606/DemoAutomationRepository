package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo1 {
	private static WebDriver OBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		 navigatte();
		closeApplication();

	}
	private	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			OBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigatte()
	{
		try
		{
			OBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			OBrowser.get("http://localhost:81/login.do");
		}catch(Exception e) 
		{
			e.printStackTrace();

		}
	}
}
