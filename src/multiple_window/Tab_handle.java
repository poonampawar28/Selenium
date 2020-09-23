package multiple_window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_handle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("tabButton")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(windows);
		System.out.println(al);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(3000);
		driver.close();
	}

}
