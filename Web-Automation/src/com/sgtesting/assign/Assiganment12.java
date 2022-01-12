package com.sgtesting.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiganment12 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanuchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		CreateUser();
		logout();
		login1();
		display();
		logout1();
		login2();
		displayimages();
		logout2();
		 login3();
		 displayimages1();
		 logout3();
		 modifypassword();
		 logout4();
		 login4();
		 logout5();

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
	private static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("Anil");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys("kumar");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("nagu123@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("nagu123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("nagu123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("megu");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys("bhavikatti");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("sagu123@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("sagu123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("sagu123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("chintu");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys("bhavikatti");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("raju123@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("raju123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("raju123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("nagu123");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void display()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout1()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sagu123");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displayimages()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("raju123");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displayimages1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"SubmitTTButton\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout3()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypassword()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("naga12");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("naga12");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.name("password")).sendKeys("raju12");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("raju12");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);


			oBrowser.findElement(By.name("password")).sendKeys("sanju12");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sanju12");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout4()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login4()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("raju12");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout5()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
