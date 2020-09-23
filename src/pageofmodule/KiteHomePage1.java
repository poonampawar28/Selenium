package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1 {
	// Declartion of variable
	@FindBy (xpath="//div[@class='avatar']") private WebElement chckProfileName;
	
	// Initilization of variable
	 public KiteHomePage1(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 //Usage of variable
	 public void checkKiteHomePage1profile(String excepted) 
	 {
		String act= chckProfileName.getText();
		if(act.equals(excepted))
		{
			System.out.println("Test Script Pass");
		}
		else
		{
			System.out.println("Test Script Fail");
		}
		
	}

}
