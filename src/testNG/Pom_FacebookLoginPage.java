package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_FacebookLoginPage {
	//Declaration of Variables
	@FindBy(xpath="//input[@name='firstname']") private WebElement textFirstName;
	@FindBy(name="lastname") private WebElement textSurname;
	@FindBy(name="reg_email__") private WebElement textMobNumber;
	@FindBy(name="reg_passwd__") private WebElement textNewPassword;
	@FindBy(xpath="//select[@id='day']") private WebElement sddDay;
	@FindBy(xpath="//select[@id='month']") private WebElement sddMonth;
	@FindBy(xpath="//select[@id='year']") private WebElement sddYear;
	@FindBy(xpath="//label[text()='Female']") private WebElement cbGender;
	@FindBy(name="websubmit") private WebElement btnSignUp;
	
	// Initialization of variables
	public Pom_FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usages of Variables 
	public void settextFirstName(String FirstName)
	{
		textFirstName.sendKeys(FirstName);
	}
	public void settextSurName(String SurName)
	{
		textSurname.sendKeys(SurName);
	}
	public void settextMobNumber(String MobNo)
	{
		textMobNumber.sendKeys(MobNo);
	}
	public void settextNewPassword(String NewPassword)
	{
		textNewPassword.sendKeys(NewPassword);
	}
	public void selectDay(String day)
	{
		Select s= new Select(sddDay);
		s.selectByVisibleText(day);
	}
	public void selectMonth(String month)
	{
		Select s= new Select(sddMonth);
		s.selectByVisibleText(month);
	}
	public void selectYear(String year)
	{
		Select s= new Select(sddYear);
		s.selectByVisibleText(year);
	}
	public void chkGender()
	{
		cbGender.click();
	}
	public void clkSignUp()
	{
		btnSignUp.click();
	}
	

}
