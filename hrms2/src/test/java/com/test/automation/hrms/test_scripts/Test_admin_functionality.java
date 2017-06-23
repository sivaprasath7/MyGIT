package com.test.automation.hrms.test_scripts;
import org.testng.annotations.Test;
import com.test.automation.hrms2.pagebase.Pagebase;
public class Test_admin_functionality  extends Pagebase
{
	@Test
	public void test_admin()
	{
		lp.login("admin","admin");
		implicitwait(driver,50);
	}
}

