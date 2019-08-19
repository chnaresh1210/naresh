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

public class DataReadFromExcel {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
		
	    WebDriver  driver = new ChromeDriver();
		
	    File f = new File("C:\\Users\\suresh\\Desktop\\FBLogIn.xlsx"); //excel data opened
	    
	    FileInputStream fis = new FileInputStream(f); //read the excel sheet data
	    
	    XSSFWorkbook w = new XSSFWorkbook(fis); //read the excel data
	    
	    XSSFSheet s = w.getSheetAt(0); // reached to the first sheet means sheet=1 is 0,sheet2 is =1
	    
        int rowCount = s.getLastRowNum()+1; //count rows in 2 i.e 1
        
        for(int i=1;i<=rowCount;i++)
        {  	    	    	    
	    	    
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");

	    
	    String username = s.getRow(i).getCell(0).getStringCellValue();
	
	    String password = s.getRow(i).getCell(1).getStringCellValue();
	
	    
	
	    driver.findElement(By.id("email")).sendKeys(username);
	    
	    driver.findElement(By.id("pass")).sendKeys(password);
	
	    
	   
	    
	
        }			
	}
}
