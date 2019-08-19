package DataDrivenTest;

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

public class CreateGmailFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver  driver = new ChromeDriver();
	
	    File f2 = new File("C:\\Users\\suresh\\Desktop\\GmailCreatePage.xlsx");
	
	    FileInputStream fis = new FileInputStream(f2);
	    
	    XSSFWorkbook w = new XSSFWorkbook(fis);
	    
	    XSSFSheet s1 = w.getSheetAt(0);
	    
	    int rowCount = s1.getLastRowNum()+2;
	    
	    for(int i=1;i<rowCount;i++)
	    {
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	
	    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    	
	    	driver.manage().deleteAllCookies();
	    	
	    	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    	
	       
	    	String firstname = s1.getRow(i).getCell(0).getStringCellValue();
	    	
	    	String lastname =s1.getRow(i).getCell(1).getStringCellValue();
	    	
	    	String email =s1.getRow(i).getCell(2).getStringCellValue();
	    	
//	    	String password =s1.getRow(i).getCell(3).getStringCellValue();
//	    	
//	    	String confirm =s1.getRow(i).getCell(4).getStringCellValue();
	    		    	    	    	   	
	    		    		    	
	    	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
	        
	        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
	        
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
	        
//	        driver.findElement(By.xpath("//div[@id='passwd']")).sendKeys(password);
//	        
//	        driver.findElement(By.xpath("//div[@id='confirm-passwd']")).sendKeys(confirm);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	    
	    
	
	
	
	
	
	
	
	
	
	
	}

}
