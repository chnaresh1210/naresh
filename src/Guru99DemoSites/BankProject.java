package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// open bank project 
		
		driver.get("http://www.demo.guru99.com/V4/customer/Customerhomepage.php");

		// Account of 3308

		driver.findElement(By.xpath("//a[contains(text(),'Balance Enquiry')]")).click();

		driver.findElement(By.name("accountno")).sendKeys("3308");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
//		driver.findElement(By.xpath("//option[contains(text(),'3308')]")).click();
		
//		Select naresh = new Select(driver.findElement(By.name("accountno")));
//
//		naresh.selectByVisibleText("3308");


	


	  
		
      clickon(driver,driver.findElement(By.xpath("//select[@name='accountno']")), 10);
		
		
	}

	public static void clickon(WebDriver driver,WebElement locator,int timeout){
		
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	
	locator.click();
	}






	}


