package testNG;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility {
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destion= new File("C:\\Users\\Admin\\eclipse-workspace\\my first project\\src\\sunday\\August2020\\ScreenShots\\face.png");
		FileHandler.copy(source,destion);
	}
	public static String getTestData(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\my first project\\src\\sunday\\August2020\\TestData\\Facebook.xlsx");
		  String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		  return value;
		 
		 
	}

}
