package action_Class;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\driver\\\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Click Button to see alert
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		//On button click, alert will appear after 5 seconds
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();
        Thread.sleep(2000);
        //3) On button click, confirm box will appear
        driver.findElement(By.id("confirmButton")).click();
        Alert alt2 = driver.switchTo().alert();
        alt2.dismiss();
        Thread.sleep(2000);
        //On button click, prompt box will appear
        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
        Alert alt3 = driver.switchTo().alert();
        alt3.sendKeys("Reyansh");
        System.out.println(alt3.getText());
        alt3.accept();
        Thread.sleep(2000);
        driver.close();
        
	}

}
