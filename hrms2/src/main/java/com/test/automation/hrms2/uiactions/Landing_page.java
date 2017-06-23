package com.test.automation.hrms2.uiactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.hrms2.pagebase.Pagebase;

public class Landing_page {
	@FindBy(xpath=".//*[@id='admin']/a")
	WebElement admin_btn;
	@FindBy(xpath=".//*[@id='pim']/a")
	WebElement pim_btn;
	@FindBy(xpath=".//*[@id='leave']/a")
	WebElement leave_btn;
	@FindBy(xpath=".//*[@id='time']/a")
	WebElement time_btn;
	@FindBy(xpath="")
	WebElement benefit_btn;
	@FindBy(xpath="")
	WebElement recuritment_btn;
	@FindBy(xpath="")
	WebElement performance_btn;
	@FindBy(xpath="")
	WebElement report_btn;
	@FindBy(xpath="")
	WebElement bugtracker_btn;
	@FindBy(xpath="")
	WebElement help_btn;
	
	
	public void admin()
	{
		Pagebase.mouse_over_action(admin_btn);
	}

}
