package input_Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("isAgeSelected")).click();
		driver.findElement(By.className("cb1-element")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	

	}
}
