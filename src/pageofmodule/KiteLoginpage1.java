package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage1 {
	// Declaration of varibales
	@FindBy(id="userid") private WebElement textUserName;
	@FindBy(id="password") private WebElement textPassword;
	@FindBy(xpath="//button[@type='submit']") private WebElement btnLogin;
	// : Initialization define Constractor
	public KiteLoginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Usage of the varibales: declare methods for each variable
	public void setKiteLoginpage1userName(String user) 
	{
		textUserName.sendKeys(user);
	}
	public void setKiteLoginpage1Password(String pass) 
	{
		textPassword.sendKeys(pass);
	}
	public void clickKiteLoginpage1button() 
	{
		btnLogin.click();
	}
	
	
	

}
