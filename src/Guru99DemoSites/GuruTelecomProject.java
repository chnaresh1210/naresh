package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTelecomProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Click on the Telecom project
		driver.get("http://demo.guru99.com/telecom/index.html");

		/*

		// click on the add new customer
		driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();

		// click on the background check
		driver.findElement(By.xpath("//label[@for='done']")).click();

		// billing address
		driver.findElement(By.id("fname")).sendKeys("naresh");

		driver.findElement(By.id("lname")).sendKeys("choppara");

		driver.findElement(By.id("email")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("ongole hiiiiiiiiiiiiiiiiii");

		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");

		driver.findElement(By.name("submit")).click();


		 */


		/*
	    // Add tariff plan to customer
		driver.findElement(By.xpath("//div[@class='flex-item left']//a[contains(text(),'Add Tariff Plan to Customer')]")).click();

	    // Customer Id
		driver.findElement(By.id("customer_id")).sendKeys("908855");

		Thread.sleep(2000);

	    // submi the customer id to add tariff plan
	    driver.findElement(By.xpath("//input[@name='submit']")).click();

	    // approverd tariff plan
	    // driver.findElement(By.xpath("//label[@for='sele']")).click();

	    Thread.sleep(2000);

	    // add tariif plan to customer
	    driver.findElement(By.xpath("//input[@name='submit']")).click();

		 */

		/*

		// add tariif plan
		driver.findElement(By.xpath("//div[@class='flex-item right']//a[contains(text(),'Add Tariff Plan')]")).click();

		// Fill the customer requirments
		driver.findElement(By.id("rental1")).sendKeys("500");

		driver.findElement(By.id("local_minutes")).sendKeys("5000");

		driver.findElement(By.id("inter_minutes")).sendKeys("500");

		driver.findElement(By.id("sms_pack")).sendKeys("100");

		driver.findElement(By.id("minutes_charges")).sendKeys("5");

		driver.findElement(By.id("inter_charges")).sendKeys("15");

		driver.findElement(By.id("sms_charges")).sendKeys("2");

		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();

		 */

		// pay bill
		driver.findElement(By.xpath("//div[@class='flex-item right']//a[contains(text(),'Pay Billing')]")).click();

		driver.findElement(By.id("customer_id")).sendKeys("908855");

		driver.findElement(By.xpath("//input[@name='submit']")).click();

				












	}

}
