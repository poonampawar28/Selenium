package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageofmodule.KiteHomePage1;
import pageofmodule.KiteLoginpage1;
import pageofmodule.Kiteloginpage2;

public class PomWith_TestNG {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		Reporter.log("open chrome browser",true);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		driver= new ChromeDriver(option);
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		Reporter.log("login to application",true);
		KiteLoginpage1 login1= new KiteLoginpage1(driver);
		login1.setKiteLoginpage1userName("LN2407");
		login1.setKiteLoginpage1Password("sweet3773");
		login1.clickKiteLoginpage1button();
		Thread.sleep(3000);
		Kiteloginpage2 login2= new Kiteloginpage2(driver);
		login2.setKiteloginpage2pin("170077");
		login2.clickKiteloginpage2continue();
		
	}
	@Test
	public void home() throws Exception
	{
		Reporter.log("home page of Kite", true);
		Thread.sleep(2000);
		KiteHomePage1 hm= new KiteHomePage1(driver);
		Thread.sleep(2000);
		hm.checkKiteHomePage1profile("SA");
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Reporter.log("logout Kite Application", true);
		driver.findElement(By.className("avatar")).click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//span[@class='icon icon-exit']"));
		Actions act= new Actions(driver);
		act.moveToElement(logout).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close chrome browser", true);
		driver.close();
	}

}
