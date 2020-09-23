package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_HardCode {
	@Test
	public void check()
	{
		String abc="poonam";
		String xyz="Poonam";
		//Assert.assertNotEquals(abc, xyz); 
//		String png="Poonam";
//		Assert.assertEquals(xyz,png);
		//boolean act= true;
		//Assert.assertTrue(act);
		boolean result= false;
		Assert.assertFalse(result);
	}

}
