package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKartTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("-disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
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
