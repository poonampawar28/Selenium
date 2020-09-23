package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("draggable"));
		System.out.println("source"+source.getTagName());
		WebElement dest = driver.findElement(By.id("droppable"));
		System.out.println("target"+dest.getText());
		Actions act= new Actions(driver);
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		//act.dragAndDrop(source, dest).build().perform();
		
	}

}
