package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Ifram_class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'display ')]"));
		ele.click();
		driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@style='font-size:16px']")).click();
        driver.close();
        
		 
	}
	
	
	
	

}
