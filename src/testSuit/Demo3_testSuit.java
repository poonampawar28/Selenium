package testSuit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3_testSuit {
	@Test 
	public void test5()
	{
		SoftAssert sft= new SoftAssert();
		sft.assertEquals('p', 'S');
		Reporter.log("good morning",true);
		sft.assertAll();
	}
	@Test
	public  void test6()
	{
		String st= "Reyansh";
		String str= "sameer";
		Assert.assertEquals(st, str);
		Reporter.log("I am reyansh",true);
	}

}
