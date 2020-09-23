package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_ifame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/nested%20I%20frame/sample.html.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poonam");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123abc");
		Thread.sleep(2000);
		driver.switchTo().frame("frame2"); 
		driver.findElement(By.xpath("//input[@id='abcd']")).sendKeys("poonamshinde");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='xyz']")).sendKeys("5858123442");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);   
		
		driver.close();
	}

}
