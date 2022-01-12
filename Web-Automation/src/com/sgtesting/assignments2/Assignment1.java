package com.sgtesting.assignments2;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1{
	public static WebDriver oBrowser=null;
	public static AssignmentActitime oPage=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new AssignmentActitime (oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
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

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassWord().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getCreateuserFirstname().sendKeys("Anil kumar");
			Thread.sleep(2000);
			oPage.getCreateUserLastName().sendKeys("Bhavikatti");
			Thread.sleep(2000);
			oPage.getCreateUserEmail().sendKeys("Anil@gmail.com");
			Thread.sleep(2000);
			oPage.getCreateUsername().sendKeys("anil");
			oPage.getCreateUserpassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getCreateUserConfirmPassword().sendKeys("123456");
			oPage.getCreateUserConfirm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try {
			oPage.getselectCreateusertoDelete().click();
			Thread.sleep(3000);
			oPage.getselectDeleteUser().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}


}



