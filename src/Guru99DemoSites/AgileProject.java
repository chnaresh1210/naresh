package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgileProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

        // open Security project 
		driver.get("http://demo.guru99.com/Security/SEC_V1/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("1303");
		
		driver.findElement(By.name("password")).sendKeys("Guru99");
		
		driver.findElement(By.name("btnLogin")).click();

	    // Balance Enquiry
		driver.findElement(By.xpath("//a[contains(text(),'Mini Statement')]")).click();
		
		// 3308 check mini statement		
		driver.findElement(By.xpath("//option[contains(text(),'3308')]")).click();
		
		driver.findElement(By.name("AccSubmit")).click();
		
		
		//  back to  home page
		driver.navigate().back();
		
	    Thread.sleep(5000);
	    
	    //  3309 check mini statement
	    driver.findElement(By.xpath("//option[contains(text(),'3309')]")).click();
	
	    driver.findElement(By.name("AccSubmit")).click();
	    
	    Thread.sleep(5000); 
	
	    driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
