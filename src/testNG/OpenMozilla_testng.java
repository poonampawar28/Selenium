package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenMozilla_testng {
	@BeforeMethod
	public void test1()
	{
		System.out.println("start browser");
	}
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void testchrom() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
	@AfterMethod
	private void pub() {
		System.out.println("End Browser");

	}

}
