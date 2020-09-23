package pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_after5sec {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//On button click, alert will appear after 5 seconds
				driver.findElement(By.id("timerAlertButton")).click();
				Thread.sleep(5000);
				Alert alt = driver.switchTo().alert();
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				alt.accept();
				Thread.sleep(5000);
				driver.close();
				
				
	}

}
