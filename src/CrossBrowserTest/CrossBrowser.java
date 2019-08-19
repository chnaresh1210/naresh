package CrossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrossBrowser {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		// MOZILLA FIREFOX 


		System.setProperty("webdriver.gecko.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\gecko_driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
        


		// GOOGLE CHROME



		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		//create chrome instance

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		
		Thread.sleep(3000);



		//     INTERNET EXPLORER	


		System.setProperty("webdriver.ie.driver","E:\\Work\\Suresh\\Selenium_WS\\Softwares\\IEDriver\\IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();

		Thread.sleep(3000);
		

		driver.get("https://www.facebook.com");

		//Find user name

		WebElement userName = driver.findElement(By.name("email"));

		//Fill user name

		userName.sendKeys("choppara.naresh@gmail.com");

		//Find password


		WebElement password = driver.findElement(By.name("pass"));

		//Fill password

		password.sendKeys("kmc007");

		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();


		driver.quit();


	}
}