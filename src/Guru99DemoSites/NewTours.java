package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		
		// New Tour Booking
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		//Flight Details
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
				
		driver.findElement(By.xpath("//select[@name='passCount']//option[contains(text(),'4')]")).click();
		
		driver.findElement(By.xpath("//select[@name='fromPort']//option[contains(text(),'New York')]")).click();
		
		driver.findElement(By.xpath("//select[@name='fromMonth']//option[contains(text(),'August')]")).click();
		
		driver.findElement(By.xpath("//select[@name='fromDay']//option[contains(text(),'10')]")).click();
		
		driver.findElement(By.xpath("//select[@name='toPort']//option[contains(text(),'Sydney')]")).click();
		
		driver.findElement(By.xpath("//select[@name='toMonth']//option[contains(text(),'June')]")).click();
		
		driver.findElement(By.xpath("//select[@name='toDay']//option[contains(text(),'20')]")).click();
		
		
		// Preferences
		driver.findElement(By.xpath("//input[@value='First']")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'Blue Skies Airlines')]")).click();
		
		driver.findElement(By.name("findFlights")).click();
		
	}

}
