package pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// Simple Alert
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		//On button click, alert will appear after 5 seconds
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert new_alt = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		new_alt.accept();
		Thread.sleep(5000);
		//On button click, confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		Alert thrid_alt = driver.switchTo().alert();
		Thread.sleep(2000);
		thrid_alt.accept();
		Thread.sleep(2000);
		//On button click, prompt box will appear
		driver.findElement(By.id("promtButton")).click();
		Alert four_alt = driver.switchTo().alert();
		Thread.sleep(2000);
		four_alt.sendKeys("poonam");
		Thread.sleep(2000);
		four_alt.accept();
		Thread.sleep(2000); 
		driver.close();
		
		
		
		

	}

}
