package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		 driver.switchTo().frame("frame1");
		 WebElement title = driver.findElement(By.id("sampleHeading"));
		 System.out.println(title.getText());
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("frame2");
		WebElement tl = driver.findElement(By.id("sampleHeading"));
		System.out.println(tl.getText());
		
		
	}

}
