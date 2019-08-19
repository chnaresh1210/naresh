package ACTcableUserData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActReports {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://partnerportal.actcorp.in/login");

		// Login Act Cable site

		driver.findElement(By.name("userName")).sendKeys("kalyan010582@gmail.com");

		driver.findElement(By.name("passCode")).sendKeys("110711");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		// Open my Transaction

		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();

		driver.findElement(By.xpath("//button[@data-target='#collapseThree']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();

		
		// Open Account Summary

		driver.findElement(By.xpath("//a[contains(text(),'Account Summary')]")).click();

		Thread.sleep(5000);

		
		// Open Wallet Transaction Summary

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Wallet Transaction Summary')]")).click();

		Thread.sleep(5000);

		
		// Open LCO Collection Summary

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'LCO Collection Summary')]")).click();

		Thread.sleep(5000);

		
		// Open LCO Subscriber Summary

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'LCO Subscriber Summary')]")).click();

		Thread.sleep(5000);

		
		// Open Last 5 Transactions

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Wallet Last 5 Transactions')]")).click();

		Thread.sleep(5000);

		
		// Open TopUp Report

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Wallet TOPUP Report')]")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@alt='Download Report']")).click();
				
		Thread.sleep(8000);

		
		// Service Status Summary

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Service Status Summary')]")).click();

		Thread.sleep(5000);

		
		// Open Non NTO Customer Report

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Non NTO Customer Report')]")).click();

		Thread.sleep(5000);

		
		// LCO Deal Summary Report

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'LCO Deal Summary Report')]")).click();

		Thread.sleep(10000);

		
		// User Data   
	
		driver.findElement(By.xpath("//a[contains(text(),'User Data')]")).click();

		Thread.sleep(5000);

		
		// LCO Balance Data

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'LCO Balance Data')]")).click();

		Thread.sleep(5000);













	}

}
