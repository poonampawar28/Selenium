package auto_suggestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestion_Flipkart {
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open Browser", true);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-disable-notofications");
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		
	}
	@BeforeMethod
	public void flipkartUrl()
	{
		Reporter.log("Enter url", true); 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void auto_suggestion()
	{
		Reporter.log("enter excepted search in text box", true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Broswer",true);
		driver.close();
	}

}
