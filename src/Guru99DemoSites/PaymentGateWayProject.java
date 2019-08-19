package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentGateWayProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

        // Open Payment gateway 
		driver.get("http://demo.guru99.com/payment-gateway/index.php");

		// Select Quantity of Product
		driver.findElement(By.xpath("//select[@name='quantity']//option[contains(text(),'4')]")).click();
		
		// click on Buy Now button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Now Payment Method
		// Enter the card number
		driver.findElement(By.xpath("//input[@name='card_nmuber']")).sendKeys("1234567890123456");
		
		// Enter card number
		driver.findElement(By.xpath("//select[@name='month']//option[contains(text(),'5')]")).click();
		
		// Enter the Expire date
		driver.findElement(By.xpath("//option[contains(text(),'2025')]")).click();
		
		// Enter card CVV number
		driver.findElement(By.id("cvv_code")).sendKeys("123");
		
		Thread.sleep(2000);
		
		// Final Submit
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
