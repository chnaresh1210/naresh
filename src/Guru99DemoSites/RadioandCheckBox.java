package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open Guru99 Page

		driver.get("http://demo.guru99.com/test/radio.html");

		
		// Radio Button
		
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Option 2']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Option 3']")).click();

		Thread.sleep(2000);


		

         // Check Box

		driver.findElement(By.xpath("//input[@value='checkbox1']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='checkbox3']")).click();

		Thread.sleep(2000);

		







	}

}
