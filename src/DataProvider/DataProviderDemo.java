package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;
    
		
		
		@BeforeMethod
		
		public void launchBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
	}

		@Test (dataProvider = "Data")
		
		
		public void facebookLogIn(String email , String pass) throws InterruptedException {
			
			driver.findElement(By.id("email")).sendKeys(email);
								
			driver.findElement(By.id("pass")).sendKeys(pass);
			
		}
		
		@DataProvider(name="Data")

       public Object [][] getData()
		{
			Object [][] data =
				{
					
				{"test123","*****"},
				
				{"test456","*****"},
				
				{"test789","*****"}
				
				
		};
	
	return data;
	
}

}
