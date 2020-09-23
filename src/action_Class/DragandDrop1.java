package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		WebElement dragme = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.moveToElement(dragme).clickAndHold().release(drop).build().perform();
		//act.dragAndDrop(dragme, drop).perform();
		Thread.sleep(2000);
		driver.close();
	
		
		
	}
}