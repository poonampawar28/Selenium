/*	Scenario to –
Step 1-Open Firefox and open seleniumeasy.com
Step 2- Click on follow on twitter.
Step 3- Capture the title of new tab.
Step 4- Click on the OK button.*/
package pop_Up;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario_Pop_up {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\driver\\geckodriver.exe");
		//load firefox
		WebDriver driver= new FirefoxDriver();
		//load URL
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		//Maximize Window
		driver.manage().window().maximize();
		//Button Follow on twitter
		driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']")).click();
		//PAuse for 2 sec
		Thread.sleep(2000);
		//get  windows id
		 Set<String> winds = driver.getWindowHandles();
		 // casting from set to List
		 ArrayList<String> ar= new ArrayList<String> (winds);
		 // Switch to new tab
		 driver.switchTo().window(ar.get(1));
		 System.out.println("Url: "+driver.getCurrentUrl());
		 //System.out.println("page source"+driver.getPageSource()); we get all links
		 Thread.sleep(2000);
		 driver.close();
		 driver.switchTo().window(ar.get(0));
		 Thread.sleep(2000);
		 driver.close();
		
	}


}
