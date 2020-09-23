package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChrome_testng {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	}

}
