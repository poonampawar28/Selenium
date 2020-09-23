package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage2 {
	// Declaration of variables
	@FindBy(id="pin") private WebElement textpin;
	@FindBy(xpath="//button[@type='submit']") private WebElement btnContinue;
	
	// Initialization of variables
	
	public Kiteloginpage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Usage of variables 
	public void setKiteloginpage2pin(String pin) 
	{
		textpin.sendKeys(pin);
	}
	public void clickKiteloginpage2continue() 
	{
		btnContinue.click();
	}

}
