package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceboobLogin {

	private static XSSFWorkbook w;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver  driver = new ChromeDriver();

	    File f = new File("C:\\Users\\suresh\\Desktop\\FB.xlsx");
	
	    FileInputStream fis = new FileInputStream(f);
	    
	    w = new XSSFWorkbook(fis);
	    
        XSSFSheet s = w.getSheetAt(0);
        
        int rowcount = s.getLastRowNum()+1;
        
          for(int i=1; i<=rowcount; i++)
          {
        	  
        	  driver.manage().window().maximize();
        	  
        	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        	  
        	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
              driver.get("https://www.facebook.com/");
          
              String username = s.getRow(i).getCell(0).getStringCellValue();
              
              String password = s.getRow(i).getCell(1).getStringCellValue();
              String data_profileName = s.getRow(i).getCell(2).getStringCellValue();
              
              driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
            
              driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);             
          
              
              if (driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed()) 
              {
            	  driver.findElement(By.xpath("//input[@value='Log In']")).click();  
              }
              else if (driver.findElement(By.xpath("//input[@id='u_0_a']")).isDisplayed()) 
              {
            	  driver.findElement(By.xpath("//input[@id='u_0_a']")).click();  
              }
              ////below xpath value worked for some days and then stopped working
              else if (driver.findElement(By.xpath("//input[@id='u_0_2']")).isDisplayed())
              {
            	  driver.findElement(By.xpath("//input[@id='u_0_2']")).click();  
              }
              else if (driver.findElement(By.xpath("//input[@id='u_0_d']")).isDisplayed())
              {
            	  driver.findElement(By.xpath("//input[@id='u_0_d']")).click();  
              }
              
              ////input[@value='Log In']
              
              ////input[@id='u_0_a']
              
              ////span[@class='_1vp5']
              WebElement ele_profilename = driver.findElement(By.xpath("//span[@class='_1vp5']"));
              String text_profilename = ele_profilename.toString();
              
              //verify that logged in prfile name(actual value ) matches with the expected value
              if (data_profileName == text_profilename)
              {
            	  s.getRow(i).createCell(3).setCellValue("Profile name is matched");
              }
              else
              {
            	  s.getRow(i).createCell(3).setCellValue("Profile name is NOT matched");
              }
              
          }
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
