package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1_testSuit {
	@Test
	public void test()
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public void test1()
	{
		Reporter.log("hello");
	}
	@Test
	public void test2()
	{
		Assert.assertEquals("hello", "hii");
	}

}
