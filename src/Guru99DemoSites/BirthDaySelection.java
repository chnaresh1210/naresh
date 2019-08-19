package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BirthDaySelection {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open Guru99 Page

		driver.get("http://demo.guru99.com/test/");

		driver.findElement(By.xpath("//input[@type='datetime-local']")).click();
		
		

		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.xpath("//input[@name='bdaytime']"));
			
		
		// fill the date as mm\dd\yyyy as 01\06\1990
		
		dd.sendKeys("01061990");
		
		// press tab to swift focus on time field 
		
		dd.sendKeys(Keys.TAB);
		
		// submit button
		
		dd.sendKeys("1200AM");
		
		// submit
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		




	}
}
