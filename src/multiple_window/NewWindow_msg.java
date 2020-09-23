package multiple_window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_msg {
		public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.findElement(By.id("messageWindowButton")).click();
	Set<String> tab = driver.getWindowHandles();
	ArrayList<String> al= new ArrayList<String>(tab);
	driver.switchTo().window(al.get(1));
	Thread.sleep(2000);
	//System.out.println(driver.getCurrentUrl());
	//Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(al.get(0));
	driver.close();
	
}
}
