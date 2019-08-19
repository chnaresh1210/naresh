package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.concurrent.TimeUnit;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

	WebDriver driver = new ChromeDriver();

	File f = new File("C:\\Users\\suresh\\Desktop\\FB.xlsx");

	FileInputStream fin = new FileInputStream(f);

	XSSFWorkbook w = new XSSFWorkbook(fin);

	XSSFSheet s = w.getSheetAt(0);

	int rowcount = s.getLastRowNum()+9;

	for(int i=0; i<=rowcount; i++){

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		String username = s.getRow(i).getCell(0).getStringCellValue();
		
		String password = s.getRow(i).getCell(1).getStringCellValue();

	
		driver.findElement(By.id("email")).sendKeys("choppara.naresh@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("kmcnaresh");
		
		driver.findElement(By.id("u_0_2")).click();
		
		String actual_title = driver.getTitle();
		
//		String expected_title = "Log in to Facebook | Facebook";
//		
//		Util util = new Util("C:\\Users\\suresh\\Desktop\\FB.xlsx");
//		
//		if(actual_title.equals(expected_title))
//		{
//			util.setData(0,i,2, "Fail");
//		}
//		else
//		{
//		    util.setData(0,i,2, "Pass")	;
//		}
//		
//		
		
		
}
	
	}
}