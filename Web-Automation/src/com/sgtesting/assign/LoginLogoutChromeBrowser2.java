package com.sgtesting.assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class LoginLogoutChromeBrowser2 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanuchBrowser();
		navigete();
		login();
		minimizeFlyoutWindow();
		createuser();
		
		 deletUser();
		 logout();
		 closeAppliction();

	}
	private static void lanuchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigete()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("anu");
			oBrowser.findElement(By.name("lastName")).sendKeys("bhavikatti1");
			oBrowser.findElement(By.name("email")).sendKeys("bhavikatti@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo");
			oBrowser.findElement(By.name("password")).sendKeys("bhavikattia");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("bhavikattia");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='bhavikatti1, anu']")).click();
			
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()=Logout]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeAppliction()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

