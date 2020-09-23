package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	// Declaration of variable
	@FindBy(xpath="//div[@class='avatar']") private WebElement profile;
	// Usage of variable: Contractor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//usage of variable
	public void verifyKiteHomePageProfileName() 
	{
		String act=profile.getText();
		String except= "KV";
		if(act.equals(except))
		{
			System.out.println("Test Script PASS");
		}
		else
		{
			System.out.println("Test Script FAIL");
		}
	}
	

}
