package com.sgtesting.assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutChromeBrowser1 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser1();
		//createUser2();
		//createUser3();
		deleteUser();
       logout();
       closeAppliction();
	}
	private static void launchBrowser()
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
	private static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);

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
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click(); // Users
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click(); //add user1
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Com1");
			oBrowser.findElement(By.name("password")).sendKeys("abc");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click(); // add user2
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("abd@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Com");
			oBrowser.findElement(By.name("password")).sendKeys("abc");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("bhavikatti");
			oBrowser.findElement(By.name("lastName")).sendKeys("bhavikatti2");
			oBrowser.findElement(By.name("email")).sendKeys("abd@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("tag");
			oBrowser.findElement(By.name("password")).sendKeys("abcd");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abcd");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();

			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			//String strContent=oAlert.getText();
			//System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()='Logout']")).click();
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