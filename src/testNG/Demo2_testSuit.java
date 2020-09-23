package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2_testSuit {
	@Test
	public void test3()
	{
		SoftAssert sft= new SoftAssert();
		sft.assertEquals("Poonam", "Poonam");
		Reporter.log("I am poonam",true);
		System.out.println("sameer is my Husband");
		sft.assertAll();
	}
	@Test
	public void test4()
	{
		SoftAssert sft= new SoftAssert();
		sft.assertEquals(312,123);
		Reporter.log("my birthday");
		sft.assertAll();
	}
	
	

}
