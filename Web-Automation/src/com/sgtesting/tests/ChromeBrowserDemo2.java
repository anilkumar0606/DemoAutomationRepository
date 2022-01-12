package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo2 {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		

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

}
