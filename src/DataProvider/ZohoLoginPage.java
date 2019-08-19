package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoLoginPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
		
	    WebDriver  driver = new ChromeDriver();
	
	    File f = new File("C:\\Users\\suresh\\Desktop\\Zoho Login Page.xlsx");
	    
	    FileInputStream fin = new FileInputStream(f);
	    
	    XSSFWorkbook w = new XSSFWorkbook(fin);
	    
	    XSSFSheet s = w.getSheetAt(0);
	    
	    int rowcount = s.getLastRowNum()+1;
	
	
        for(int i=1; i<rowcount; i++)
        {
        	
        	driver.manage().window().maximize();
    		
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    		
    		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    		
    		driver.get("https://accounts.zoho.in/signin?servicename=AaaServer&serviceurl=%2Fu%2Fh");

        	
    		String email = s.getRow(i).getCell(0).getStringCellValue();
    		
    		String password = s.getRow(i).getCell(1).getStringCellValue();
    		
    		
        	driver.findElement(By.id("lid")).sendKeys(email);
        	
        	driver.findElement(By.id("pwd")).sendKeys(password);
        	
        	driver.findElement(By.id("signin_submit")).click();
        	
        	
        	s.getRow(0).createCell(2).setCellValue("result");
        		
     	    s.getRow(1).createCell(2).setCellValue("passed");
        	
     	  
     	    
        	fin.close();
        	
        	FileOutputStream fos = new FileOutputStream(f);
        	
        	w.write(fos);
        	
        	       	
        }
	
		
        
        
	}

}
