package com.test.automation.hrms.test_scripts;
import org.testng.annotations.BeforeTest;
import com.test.automation.hrms2.pagebase.Pagebase;
public class Test_before_test extends Pagebase
{
	@BeforeTest
	public void openapp()
	{
		open_url();
		System.out.println("browser opened");
	}
}
