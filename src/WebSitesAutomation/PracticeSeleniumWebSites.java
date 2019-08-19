package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSeleniumWebSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		
		// launch browser
		
//		driver.get("http://www.practiceselenium.com/");
//		
//		driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000450914890']//span[text()='See Collection']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000451959280']//span[text()='Check Out']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("email")).sendKeys("chnaresh1210@gmail.com");
//
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("name")).sendKeys("naresh choppara");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("address")).sendKeys("karumanchi post and village");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//option[text()='Mastercard']")).click();
//		
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("card_number")).sendKeys("123456789100");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("cardholder_name")).sendKeys("naresh choppara");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("verification_code")).sendKeys("123");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//		
//		driver.quit();
//		
		
		
		// launch Browser
		
		driver.navigate().to("http://www.practiceselenium.com/");
		
		driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000450914899']//span[text()='See Collection']")).click();
		
        Thread.sleep(2000);
		
        driver.findElement(By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000451959280']//span[text()='Check Out']")).click();
        
        Thread.sleep(2000);
        
		driver.findElement(By.id("email")).sendKeys("chnaresh1210@gmail.com");

		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("naresh choppara");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("address")).sendKeys("karumanchi post and village");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='Mastercard']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("card_number")).sendKeys("123456789100");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("cardholder_name")).sendKeys("naresh choppara");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("verification_code")).sendKeys("123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		driver.close();
		
		
	}

}
