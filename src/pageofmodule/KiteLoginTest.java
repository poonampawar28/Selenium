package pageofmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("---Disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://Kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		//Create Object for First Login Page
		Kite_loginIn1_page lgn1= new Kite_loginIn1_page(driver);
		lgn1.setKite_loginIn1_pageUN();
		lgn1.setKite_loginIn1_pagepw();
		lgn1.clickKite_loginIn1_pagelogin();
		Thread.sleep(4000);
		//Create Object of Login PAge 2
		Kite_loginIn2_page login2=new Kite_loginIn2_page(driver);
		login2.setKite_loginIn2_pagepin();
		login2.clickKite_loginIn2_pagepcnt();
		Thread.sleep(4000);
		// Create Object of Home Page
		KiteHomePage hm= new KiteHomePage(driver);
		hm.verifyKiteHomePageProfileName();
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
