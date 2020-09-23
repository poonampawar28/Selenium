package pageofmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_loginIn1_page {
	//1) Declaration of variable
	//a) For User name
	@FindBy(xpath="//input[@id='userid']")  private WebElement un;
	//b) for Password
	@FindBy(xpath="//input[@id='password']")  private WebElement pw;
	//For login Button
	@FindBy(xpath="//button[@type='submit']")  private WebElement login;
	// 2) Initialization of Variable i.e declare Constructor with WebDriver
	public Kite_loginIn1_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3) Use of variable: define  method with public 
	//a) For user name
	public void setKite_loginIn1_pageUN() 
	{
		un.sendKeys("DV1510");
	}
	//b) For password
	public void setKite_loginIn1_pagepw() 
	{
		pw.sendKeys("April@123");
	}
	//c) For login Button
	public void clickKite_loginIn1_pagelogin() 
	{
		login.click();;
	}

}
