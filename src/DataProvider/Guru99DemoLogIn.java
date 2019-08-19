package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99DemoLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Demo guru99 log in page
		
		driver.get("http://demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("1303");
		
		driver.findElement(By.name("password")).sendKeys("");
		
		
	}

}
