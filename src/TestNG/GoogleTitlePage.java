package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitlePage {

	WebDriver driver;

	@BeforeMethod

	public void launchBrowser(){

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
	}

	@Test (priority=1)

	public void PageTitle(){

		
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "Google", "title not matched");

	}

	@Test (priority=2)
	
	public void clickLink(){
		
		
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	
	@Test
	
	public void condtionTrue(){
		
		boolean a= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		Assert.assertTrue(a);
		Assert.assertEquals(a,true);
		
		
		
		
	}
	
	@AfterMethod

	public void closeBrowser(){

		driver.quit();
	}

}