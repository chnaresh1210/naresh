package ACTcableUserData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMoneyInWallet {

	public static void main(String[] args) {
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

        // Add money Into The Wallet
		
		driver.findElement(By.xpath("//h1[contains(text(),' Load Wallet')]")).click();
		
		driver.findElement(By.xpath("//input[@id='amt']")).sendKeys("100");
		
		driver.findElement(By.xpath("//button[contains(text(),'Add Money')]")).click();
		
		
		
		
		
	}

}
