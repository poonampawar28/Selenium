package data_Driver_frameWork;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Data_Driver_frame {

	public static void main(String[] args) throws Exception, Exception {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable notifications-");
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver83.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//Fetch Excel Sheet
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\DDF.xlsx");
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		//First Name
		 String name = sheet.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.name("firstname")).sendKeys(name);
		//LAst name
		String surname = sheet.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.name("lastname")).sendKeys(surname);
		//Mobile No
		String mob = sheet.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.name("reg_email_  _")).sendKeys(mob);
		//PAssword
		String pwd = sheet.getRow(0).getCell(3).getStringCellValue();
		driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		//Birthday Day
		String DOB = sheet.getRow(0).getCell(4).getStringCellValue();
		WebElement day = driver.findElement(By.id("day"));
		Select dy= new Select(day);
		dy.selectByVisibleText(DOB);
		// Month
		String DOM = sheet.getRow(0).getCell(5).getStringCellValue();
		WebElement month = driver.findElement(By.id("month"));
		Select mn= new Select(month);
		mn.selectByVisibleText(DOM);
		//Year
		String YOB = sheet.getRow(0).getCell(6).getStringCellValue();
		WebElement year = driver.findElement(By.id("year"));
		Select yr= new Select(year);
		yr.selectByVisibleText(YOB);
		// Gender
		 String actual = sheet.getRow(0).getCell(7).getStringCellValue();
		 WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		 String expected = gender.getText();
		 if(actual.equalsIgnoreCase(expected))
		 {
			 gender.click();
		 }
		 else 
		 {
			 driver.findElement(By.xpath("//label[text()='Male']")).click();
		 }
		 // Submit button
		driver.findElement(By.name("websubmit")).click();
		}

}
