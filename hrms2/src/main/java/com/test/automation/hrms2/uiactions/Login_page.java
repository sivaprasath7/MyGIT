package com.test.automation.hrms2.uiactions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Login_page 
{	
	@FindBy(name="txtUserName")
	WebElement login_textbox;
	@FindBy(name="txtPassword")
	WebElement password_text;
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")
	WebElement login_btn;
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/input")
	WebElement reset_btn;

	public void login(String username,String password)
	{
		login_textbox.sendKeys(username);
		password_text.sendKeys(password);
		login_btn.click();
	}

}
