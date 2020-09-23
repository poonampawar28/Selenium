package testNG;

import org.testng.annotations.Test;

public class TimeOut_TestNG {
	@Test(timeOut=5000)
	public void Login()
	{
		System.out.println("i am in application");
	}
	@Test
	public void LogOut()
	{
		System.out.println("i am out of the Application");
	}

}
