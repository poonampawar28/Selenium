package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod_TestNG {
	@Test(dependsOnMethods= {"Login"},timeOut=2000)
	public void logOut() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("I am out");
	}
	@Test
	public void Login()
	{
		System.out.println("i am in");
	}
	

}
