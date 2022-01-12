package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo3 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigatte();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigatte()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

