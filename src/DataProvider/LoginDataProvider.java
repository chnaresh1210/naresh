package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {

	WebDriver driver;
	
	@BeforeMethod 
	
	public void pageLaunch(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
	
		driver.navigate().to("https://www.zoho.in/crm/lp/crm-software.html?network=g&device=c&keyword=%2Bcrm%20%2Bwebsite&campaignid=2081105189&creative=374625606610&matchtype=b&adposition=1t1&placement=&adgroup=79333067689&gclid=CjwKCAjw-ITqBRB7EiwAZ1c5U6FCtm1kSnlXrDnufXj2uxg4BWMJWGf8PSMg26wdKGtjrZ_B-tgw2xoCdPgQAvD_BwE");
}
       
	@Test (dataProvider = "data")
	
	public void facebookLogIn(String username , String password){
		

		driver.findElement(By.id("email")).sendKeys(username);
							
		driver.findElement(By.id("pass")).sendKeys(password);
	
	
	}

	@Test (dataProvider = "data")
	
      public void CRMpage(String username , String password){
		

		driver.findElement(By.id("namefield")).sendKeys(username);
							
		driver.findElement(By.name("password")).sendKeys(password);
	
	
	}
	
	
	 @DataProvider (name= "data")
	 
	 public Object [][] getdata()
	 {
		 Object [][] data=
			 {
				 {"test@gmail.com","test"},
				 {"test1@gmail.com","test1"},
				 {"test2@gmail.com","test2"},
				 {"test3@gmail.com","test3"},
				 {"test4@gmail.com","test4"}  
					 
			 
			 };
		return data;
	 }
	 
	
}