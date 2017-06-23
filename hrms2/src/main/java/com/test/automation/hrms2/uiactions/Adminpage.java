package com.test.automation.hrms2.uiactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.hrms2.pagebase.Pagebase;

public class Adminpage {
	WebDriver driver;
	Pagebase pb;
	public Adminpage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='admin']/ul/li[1]/a/span")
	WebElement Company_Info;
	@FindBy(xpath=".//*[@id='admin']/ul/li[2]/a/span")
	WebElement job;
	@FindBy(xpath=".//*[@id='admin']/ul/li[1]/ul/li[1]/a/span")
	public static WebElement general;
	
	public void Company_Info()
	{
		Pagebase.mouse_over_action(Company_Info);
		
	}
	public void general()
	{
		general.click();
	}
	

}
