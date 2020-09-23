package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		Dimension d= new Dimension(400, 400);
		driver.manage().window().setSize(d);
		Point p= new Point(500,600);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		WebElement First = driver.findElement(By.name("firstname"));
		Actions act=new Actions(driver);
		act.moveToElement(First).click().sendKeys("poonam").sendKeys(Keys.TAB).
		sendKeys("pawar").sendKeys(Keys.TAB).sendKeys("poonamshinde33@gmail.com").
		sendKeys(Keys.TAB).sendKeys("poonam123").build().perform();
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		for (int i = 1; i <=11; i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
