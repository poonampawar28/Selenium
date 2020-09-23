
// got to https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
package multi_select_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_select {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Dimension d= new Dimension(500,500);
		driver.manage().window().setSize(d);
		Point p= new Point (600,200);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.id("select-demo"));
		Select s= new Select(day);
		s.selectByVisibleText("Thursday");
		driver.close();
		
	}

}
