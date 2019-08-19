package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCustomerForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open Guru99 Page

//		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
				
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		// Alert PopUp
		
		Alert alert = driver.switchTo().alert();
					
		alert.accept();
		
		Thread.sleep(5000);
		
		alert.accept();
		
	}

}
