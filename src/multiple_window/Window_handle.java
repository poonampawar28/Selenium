package multiple_window;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA ')]")).click();
		WebElement search = driver.findElement(By.className("LM6RPg"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Redmi 8 (Onyx Black, 64 GB)']")).click();
		// get all window id
		Set<String> webid = driver.getWindowHandles();
		// casting set to list to store id in sequence
        ArrayList<String> tab = new ArrayList<String> (webid);
        String id= tab.get(1);
        driver.switchTo().window(id);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getTitle());
        driver.close();
        //driver.close();
        driver.switchTo().window(tab.get(0));
        driver.close();
        
	}

}
