package pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
	Alert alt= driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alt.getText());
	Thread.sleep(2000);
	//alt.accept();
	alt.dismiss();
	Thread.sleep(2000);
	driver.close();
	
}
}
