package Guru99DemoSites;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlashMovieDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open Guru99 Page
		
		driver.get("http://demo.guru99.com/access.php?uid=mngr214684%20&%20pass=UpArUqY%20&%20email=chnaresh1210@gmail.com");

		// select drop down box
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		
		// select first option flash movie demo
		
		driver.findElement(By.xpath("//a[contains(text(),'Flash Movie Demo')]")).click();
	
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//embed[@name='myFlashMovie']")).click();
		
		// Play the flash movie
		
		
		driver.findElement(By.xpath("//input[@name='Play']")).click();
		
		Thread.sleep(5000);
		
		// stop the flash player
		
		driver.findElement(By.xpath("//input[@name='Stop']")).click();
		
		// ZoomIn
		
		driver.findElement(By.xpath("//input[@name='Zoomin']")).click();
		
		// Zoom out
		
		driver.findElement(By.xpath("//input[@name='Zoomout']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
