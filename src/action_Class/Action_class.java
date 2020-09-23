package action_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Action_class {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
//		driver.navigate().to("https://google.com/");
//		Thread.sleep(2000);
		driver.navigate().to("https://amazon.in");
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().refresh();
//		Dimension d= new Dimension(200,200);
//		driver.manage().window().setSize(d);
//		Thread.sleep(2000);
//		Point p= new Point(400,400);
//		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Move Mouse to Element
		WebElement sign_up = driver.findElement(By.id("nav-link-accountList"));
		Actions act= new Actions(driver);
		act.moveToElement(sign_up).perform();
		//Right Click on mouse
		act.contextClick(sign_up).perform();
//		//combine action move mouse+ right click
//		act.moveToElement(sign_up).contextClick(sign_up).build().perform();
		WebElement prime = driver.findElement(By.id("nav-link-prime"));
		act.moveToElement(prime).perform();
		act.moveToElement(sign_up).perform();
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		driver.findElement(By.xpath("//div[@class='a-box ya-card--rich']")).click();
		driver.findElement(By.name("email")).sendKeys("7038546855");
		driver.findElement(By.id("continue")).click();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Admin\\Desktop\\SELENIUM\\amazon"+RandomString.make(3)+"jpg");
		FileHandler.copy(source, dest);
		
	}

}
