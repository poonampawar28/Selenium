package multi_select_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_selected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement city = driver.findElement(By.id("multi-select"));
		System.out.println(city.isDisplayed());
		Select s= new Select(city);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("California");
		s.selectByVisibleText("New York");
		s.selectByVisibleText("Ohio");
		s.selectByVisibleText("Washington");
		List<WebElement> all_opt = s.getAllSelectedOptions();
		for  (WebElement Element : all_opt) 
		{
			System.out.println(Element.getText());
		}
		s.deselectByIndex(0);
		Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
