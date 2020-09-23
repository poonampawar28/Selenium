package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Position;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import junit.framework.TestResult;

public class FacebookCreateAccountTest extends Browser_Factory {
	//WebDriver driver;
	Pom_FacebookCreateAccountPage acct;
	Pom_FacebookLoginPage login;
	@BeforeMethod
	
	public void openBrowser() throws InterruptedException
	{
		openBrowser1();
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("-disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
//		 driver= new ChromeDriver(opt);
//		driver.get("https://www.facebook.com/");
//		Dimension d= new Dimension(400,400);
//		driver.manage().window().setSize(d);
//		Point p = new Point(500,500);
//		driver.manage().window().setPosition(p);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
		
		}
	@Test
	public void creatAccount() throws InterruptedException, Exception, IOException
	{
		
		//Create an Account
		  acct= new Pom_FacebookCreateAccountPage(driver);
		//Thread.sleep(3000);
		acct.clickOncreateAccount();
		
		// Facebook Login PAge
		 login= new Pom_FacebookLoginPage(driver);
		Thread.sleep(3000); 
		login.settextFirstName(Utility.getTestData(0, 0));
		login.settextSurName(Utility.getTestData(0, 1));
		login.settextMobNumber(Utility.getTestData(0,2));
		login.settextNewPassword(Utility.getTestData(0, 3));
		login.selectDay(Utility.getTestData(0, 4));
		login.selectMonth(Utility.getTestData(0, 5));
		login.selectYear(Utility.getTestData(0, 7));
		login.chkGender();
		login.clkSignUp();
		}
	@AfterMethod 
	public void closeBrowser(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.takescreenshot(driver);
		}
		
		
	}

}
