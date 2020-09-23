package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class FlipKart_TestNg {
//	WebDriver driver;
//	@BeforeClass
//	public void openBrowser() throws InterruptedException
//	{
//		Reporter.log("open chrome",true);
//		ChromeOptions opt= new ChromeOptions();
//		opt.addArguments("-disable-notifications");
//		
//		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
//		WebDriver driver= new ChromeDriver(opt);
//		
//	}
//	@BeforeMethod
//	public void ulr() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		Reporter.log("load URL",true);
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
//		
//		FlipkartHomePage hm= new FlipkartHomePage(driver);
//		hm.setSearchBox("Moblies");
//		hm.clickOnButton();
//		Thread.sleep(3000);
//	}
//	@Test
//	public void flip() throws InterruptedException
//	{
//		Reporter.log("verify title",true);
//		FlipkartHomePage hm= new FlipkartHomePage(driver);
//		hm.setSearchBox("Moblies");
//		hm.clickOnButton();
//		Thread.sleep(3000);
//	}
//	@AfterMethod
//	public void title()
//	{
//		FlipKartMobliePage mob= new FlipKartMobliePage(driver);
//		mob.CheckTitle("Redmi 8 (Ruby Red, 64 GB)");
//	}
//	@AfterClass 
//	public void close()
//	{
//		driver.close();
//	}
	@Test
	public void flipkar() throws InterruptedException
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("-disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		// FlipKart Home Page
		FlipkartHomePage hm= new FlipkartHomePage(driver);
		hm.setSearchBox("Moblies");
		hm.clickOnButton();
		Thread.sleep(3000);
		// Flipkart  Moblie page
		FlipKartMobliePage mob= new FlipKartMobliePage(driver);
		mob.CheckTitle("Redmi 8 (Ruby Red, 64 GB)");
		driver.close();
	}

}
