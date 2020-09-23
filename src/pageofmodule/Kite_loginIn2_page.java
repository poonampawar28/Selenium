package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_loginIn2_page {
	// Declaration of variable
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement cnt;
	// Initialization of variable:Declare constructor with public
	public Kite_loginIn2_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Useage of variable: declare method
	public void setKite_loginIn2_pagepin() 
	{
		pin.sendKeys("038631");
	}
	public void clickKite_loginIn2_pagepcnt() 
	{
		cnt.click();
	}
	

}
