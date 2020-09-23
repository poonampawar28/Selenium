package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample_testng3 {
	@BeforeMethod
	public void test()
	{
		System.out.println("Before class");
	}
	@Test
	public void test1()
	{
		System.out.println("I am First Test");
	}
	@Test
	public void test3()
	{
		System.out.println("I am second Test");
	}
	@AfterMethod
	public void test2()
	{
		System.out.println("After Class");
	}

}
