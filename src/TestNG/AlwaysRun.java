package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlwaysRun {

	WebDriver driver;
	
	
	@BeforeMethod
	
	public void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
		
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}

@Test (groups ="naresh")

public void logInPage() throws InterruptedException{
	
	driver.findElement(By.id("email")).sendKeys("9849108737");
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("pass")).sendKeys("kmc007");
	
	
}

@Test (groups = "choppara")

public void youtubeSearch() throws InterruptedException{
	
	driver.navigate().to("https://www.youtube.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='search']")).click();

}


@AfterMethod

public void closeBrowser(){
	
	driver.quit();
}











}
