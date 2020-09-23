package auto_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@maxlength='2048']")).sendKeys("i phone ");
		Thread.sleep(2000);
		List<WebElement> all_opt = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(all_opt.size());
		String actual= "iphone 7";
		for  (WebElement opt : all_opt) 
		{
			String expect = opt.getText();
			System.out.println(expect);
			
			if(actual.equalsIgnoreCase(expect))
			{
			//	System.out.println(expect);
				opt.click();
			}
			
			
		}
		
	}

}
