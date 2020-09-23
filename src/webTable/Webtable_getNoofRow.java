package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable_getNoofRow {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\my first project\\src\\sunday\\August2020\\BrowserPath\\chromedriver84.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/SELENIUM/WebTable_HTML/webTable.html");
		driver.manage().window().maximize();
		List<WebElement> FirstRow = driver.findElements(By.xpath("//table[@id='12345']/tbody/tr"));
		int row_size = FirstRow.size();
		System.out.println(row_size);
		String exp="200";
		for(WebElement webElement : FirstRow)
		{
			//System.out.println(webElement.getText());
			
			String act = webElement.getText();
			//System.out.println(act);
			if(exp.equals(act))
			{
				System.out.println(exp);
			}
			break;
			
		}
//		int CellSize=driver.findElements(By.xpath("//table[@id='12345']/tbody/tr[2]/td")).size();
//		System.out.println(CellSize);
     	driver.close(); 
		 
	}

}
