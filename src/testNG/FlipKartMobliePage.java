package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartMobliePage {
	@FindBy(xpath="(//div[@class='_3wU53n'])[1]") private WebElement lblMobile;
	
	
	public FlipKartMobliePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	public void CheckTitle(String excepted)
	{
		String actual = lblMobile.getText();
		System.out.println(actual);
		if (actual.equalsIgnoreCase(excepted))
		{
			System.out.println("TestScript PASS");
		}
		else
		{
			System.out.println("Test Script FAIL");
		}
	}
	
	
	
	
	
	
	
	
	

}
