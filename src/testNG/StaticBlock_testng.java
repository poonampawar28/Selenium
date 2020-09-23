package testNG;

import org.testng.annotations.Test;

public class StaticBlock_testng {
	@Test
	public void test()
	{
		System.out.println("i am test");
	} 
	static
	{
		System.out.println("i am Static block");
	}
	

}
