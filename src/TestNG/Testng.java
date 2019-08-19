package TestNG;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {

	WebDriver driver;	
	
		@BeforeTest
		
		public void launchpage(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
		
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
	
		
		
	}

		
		
		@Test (priority=1,groups="naresh")
		public void launchgooglepage() throws InterruptedException{
			
			driver.navigate().to("https://www.facebook.com/");
			
			String actual_title = "Facebook – log in or sign up";

			String title1 = driver.getTitle();
			
			System.out.println(title1);

			
			Assert.assertEquals(driver.getTitle(), actual_title);
			
			
			
			
			
			
//			driver.findElement(By.xpath(""))
			
			
//			driver.findElement(By.className("inputtext")).sendKeys("9849108737");
//			
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kmc007");
//			
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
//			
		}
		
		@Test (priority=2, groups="choppara")
		public void youtubeopen() throws InterruptedException{
		   
			driver.navigate().to("https://www.youtube.com/");

			String actual_title = "YouTube";
			
			Assert.assertEquals(driver.getTitle(), actual_title);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			

		}
		
		
		
		
			
	
			
			
			
			
		
}
