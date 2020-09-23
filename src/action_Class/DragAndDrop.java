package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("drag1"));
		WebElement dest   = driver.findElement(By.id("div2"));
		Actions act= new Actions(driver);
		//act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		act.dragAndDrop(source,dest).build().perform();
		
	}

}
