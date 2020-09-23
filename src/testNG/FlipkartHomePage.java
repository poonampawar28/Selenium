package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	// Declaration of variables
		@FindBy (xpath="//input[contains(@title,'Search for ')]") private WebElement txtSearchBox;
		@FindBy (className="vh79eN") private WebElement clkbutton;
		// Initilization of variables
		public FlipkartHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public  void setSearchBox(String search)
		{
			txtSearchBox.sendKeys(search);
		}
		public void clickOnButton()
		{
			clkbutton.click();
		}

}
