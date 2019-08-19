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

public class EbayCreateAccount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
		
	    WebDriver  driver = new ChromeDriver();
		
	    File f1 = new File("C:\\Users\\suresh\\Desktop\\EbayLogInAccount.xlsx"); //excel data opened
	    
	    FileInputStream fis1 = new FileInputStream(f1); //read the excel sheet data
	    
	    XSSFWorkbook w = new XSSFWorkbook(fis1); //read the excel data
	    
	    XSSFSheet s = w.getSheetAt(0); // reached to the first sheet means sheet=1 is 0,sheet2 is =1
	    
        int rowCount = s.getLastRowNum()+1; //count rows in 2 i.e 1
        
        for(int i=1;i<=rowCount;i++)
        {
        	
        
	     	    	    	    	    	    
	    
	    
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");

	    
	    String firstname = s.getRow(i).getCell(0).getStringCellValue();
	
	    String lastname = s.getRow(i).getCell(1).getStringCellValue();
	
	    String email = s.getRow(i).getCell(2).getStringCellValue();

	    String password = s.getRow(i).getCell(3).getStringCellValue();
	    
	    	    	    	    
	    driver.findElement(By.id("firstname")).sendKeys(firstname);
	    
	    driver.findElement(By.id("lastname")).sendKeys(lastname);
	
	    driver.findElement(By.id("email")).sendKeys(email);
	    
	    driver.findElement(By.id("PASSWORD")).sendKeys(password);
	    
	
        }
	
	}

}
