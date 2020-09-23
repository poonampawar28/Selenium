package webTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetParticularElement {
public static void main(String[] args) {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("-disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\my first project\\src\\sunday\\August2020\\BrowserPath\\chromedriver84.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Desktop/SELENIUM/WebTable_HTML/webTable.html");
	driver.manage().window().maximize();
}
}
