package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_FacebookCreateAccountPage {
	// Declaration of variable
	@FindBy(xpath="//a[@role='button']") private WebElement btnCreateAccount;
	
	//initialization of variable
	public Pom_FacebookCreateAccountPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// usage of variable
	public void clickOncreateAccount() 
	{
		btnCreateAccount.click();
	}

}
 