package pageofmodule;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest1 {
	public static void main(String[] args) throws Exception {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://Kite.Zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//first Login PAge
		KiteLoginpage1 login1= new KiteLoginpage1(driver);
		login1.setKiteLoginpage1userName("LN2407");
		login1.setKiteLoginpage1Password("sweet3773");
		login1.clickKiteLoginpage1button();
		Thread.sleep(3000);
		// Second Login PAge
		Kiteloginpage2 login2= new Kiteloginpage2(driver);
		login2.setKiteloginpage2pin("170077");
		login2.clickKiteloginpage2continue();
		Thread.sleep(3000);
		//Home Page
		KiteHomePage1 hm= new KiteHomePage1(driver);
		hm.checkKiteHomePage1profile("SA");
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
