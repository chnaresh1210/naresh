package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {

	WebDriver driver;
	
	@BeforeMethod
	
	public void launchBrowser(){
	
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
	
    driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.google.com/");
	
	}
 
    @Test (groups="Title") 
    
    public void PageTitle(){
    	
//    	driver.get("https://www.google.com/");
    	
    	String str= driver.getCurrentUrl();
    	
    	System.out.println(str);
    	
     }

    @Test (groups="Title")
    
    public void googleLogo(){
    	
//    	driver.navigate().to("https://www.google.com/");
    	
//    	driver.findElement(By.partialLinkText("Gmail")).click();
//    	driver.get("https://www.google.com/");
    	
       boolean a=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
       
    	System.out.println(a);
    }
    
    @Test (groups="Title")	  	
    
    public void openGmail(){
    	
//    	driver.get("https://www.google.com/");
    	
    	driver.findElement(By.partialLinkText("Gmail")).click();
    	
    }
    
    @AfterMethod
    
    public void closeBrowser(){
    	
    	driver.close();
    }

}
