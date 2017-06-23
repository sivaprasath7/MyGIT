package com.test.automation.hrms2.pagebase;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.hrms2.uiactions.Landing_page;
import com.test.automation.hrms2.uiactions.Login_page;
public class Pagebase 
{
	public static WebDriver driver;
	protected Login_page lp;
	protected Landing_page landingpage;
	//public static string browser; 
	public Pagebase()
	{
		set_setbroser("firefox");
		lp=PageFactory.initElements(driver, Login_page.class);
		landingpage=PageFactory.initElements(driver, Landing_page.class);
	}
	public static void set_setbroser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("pls prefer firefox");
		}
	}
	public static void open_url()
	{
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		max_browser();
	}
	public static void implicitwait(WebDriver driver,int timecount)
	{
		driver.manage().timeouts().implicitlyWait(timecount, TimeUnit.SECONDS);
	}
	public static void mouse_over_action(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public static void explict_wait(int timecount,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,timecount);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void max_browser()
	{ 
		driver.manage().window().maximize();
	}
	public static void enter_frame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public static void exit_frame()
	{
		driver.switchTo().defaultContent();
	}
	/*public static void mouse_over_action_click(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	*/public static void robot_action(String keys) throws AWTException 
	{
		Robot robot=new Robot();
		try{
			if(keys.equalsIgnoreCase("down"))
				{
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				}
			else if(keys.equalsIgnoreCase("up"))
				{
				robot.keyPress(KeyEvent.VK_UP);
				robot.keyRelease(KeyEvent.VK_UP);
				}
			else if(keys.equalsIgnoreCase("enter"))
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		catch(Exception e)
				{
			System.out.println("please add ur required key in robot class");
			e.getMessage();
				}
		}

	

}
