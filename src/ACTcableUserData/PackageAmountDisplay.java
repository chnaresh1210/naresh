package ACTcableUserData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PackageAmountDisplay {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		FileReader reader = new FileReader("C:\\Users\\suresh\\Desktop\\naresh_choppara.txt");
		
		
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

		// Open Package Management
		
		driver.findElement(By.xpath("//h1[contains(text(),' Package Management')]")).click();
		
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("12674784");
		
		driver.findElement(By.xpath("//input[@id='searchAccPhMac']")).click();
		
		// open MAc id subscriber
		
		driver.findElement(By.xpath("//a[contains(text(),'111409024125')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),' Currently Subscribed Packs/Channels ')]")).click();
		
		// package Information
		
		driver.findElement(By.xpath("//label[contains(text(),'ADDON_ALA_NICK')]")).click();
		
		System.out.println("package Cost:" +driver.findElement(By.xpath("//label[contains(text(),'ADDON_ALA_NICK')]")).getText());
		
		
		
		
	}

}
