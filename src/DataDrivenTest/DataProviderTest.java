package DataDrivenTest;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class DataProviderTest {

	public WebDriver driver;
	
	@Test (dataProvider = "TestData")
	
	public void adminLogin(String firstname, String lastname, String email, String password){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
	
	    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	    
	    driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    
	    driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
	    
	}      
	
	
	@AfterMethod
	
	public void closebrowser(){
		
		driver.close();
		
	}
	
	@DataProvider (name ="TestData")
	
	public  String[][] readExcel() throws BiffException, IOException{
	
	File f = new File ("C:\\Users\\suresh\\Desktop\\EbayLogInAccount.xlsx");

	Workbook w = Workbook.getWorkbook(f);

    Sheet s = w.getSheet("Sheet1");
   
    int columns = s.getColumns();
   
    int rows = s.getRows();
   
//    System.out.println(columns+" , " +rows);
   
   String inputdata [][] = new String [rows][columns];
   
   for(int i=0; i <rows+5; i++){
	   
	   for(int j=0; j< columns+4; j++){
    
		   Cell c = s.getCell(i,j);
		   
       inputdata [i][j] = c.getContents();
       
//       System.out.println(inputdata[i][j]);
       
	   }
  
   }
return inputdata;
  

}
}
	
