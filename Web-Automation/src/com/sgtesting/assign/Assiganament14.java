package com.sgtesting.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiganament14 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanuchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser1();
		logout();
		loginuser1();
		loginuser2();
		loginuser3();
		login2user3();
		modifyuser3();
		modifyuser2();
		modifyuser1();
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
	private static void navigate()
	{
		try
		{
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
			oBrowser.findElement(By.name("firstName")).sendKeys("pappi");
			oBrowser.findElement(By.name("lastName")).sendKeys("abcd");
			oBrowser.findElement(By.name("email")).sendKeys("abs@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("password")).sendKeys("abc");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			System.out.println("createUser1");
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
	private static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click(); //add user1
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("mallu");
			oBrowser.findElement(By.name("lastName")).sendKeys("katti");
			oBrowser.findElement(By.name("email")).sendKeys("absf@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("password")).sendKeys("cba");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("cba");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
			System.out.println("loginUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("cba");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click(); //add user1
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("reddy");
			oBrowser.findElement(By.name("lastName")).sendKeys("Anil");
			oBrowser.findElement(By.name("email")).sendKeys("absd@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("password")).sendKeys("abcd");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("abcd");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);

			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("loginUser2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("abcd");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("loginUser3");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login2user3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("cba");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("login2user3");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("modifyuser3");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login1user2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abc");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("654321");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("654321");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("login1user2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("654321");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("modifyuser2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
           Thread.sleep(3000);
           oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
           oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("9611060");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("9611060");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
			System.out.println("modifyuser1");
           }catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
