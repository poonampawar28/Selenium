package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClass_testng {
	@BeforeClass
	public void open()
	{
		System.out.println("open browser");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login page");
	}
	@Test(priority=1)
	public void test()
	{
		System.out.println("test is running");
	}
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout page");
	}
	@AfterClass
	public void close()
	{
		System.out.println("close browser");
	}

}
