package multiple_window;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.name("NewTab")).click();
		 Thread.sleep(2000);
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getCurrentUrl());
		WebElement link = driver.findElement(By.xpath("//a[contains(@href,'qavalidation.com')][2]"));
        Actions act= new Actions(driver);
        act.moveToElement(link);
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
       // driver.close();
        
	}

}
