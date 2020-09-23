package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Factory {
			static WebDriver driver;
		public static WebDriver openBrowser1() {
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("-disable-notifications");
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\my first project\\src\\sunday\\August2020\\BrowserPath\\chromedriver84.exe");
			 driver = new ChromeDriver(opt);
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 return driver;
			
		}

	}



