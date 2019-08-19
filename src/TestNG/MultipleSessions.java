package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSessions {

	WebDriver driver;

	@Test

	public void googleHomePage(){

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Gmail

		driver.get("https://www.google.com/");

		WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));

		gmail.click();
		
	    String title = driver.getTitle();
	    	    
	    System.out.println(title); 
	}

	

	@Test

	public void facebookHomePage(){

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Fcaebook

		driver.get("https://www.facebook.com/");

		WebElement fb = driver.findElement(By.xpath("//input[@id='email']"));

		fb.sendKeys("9849108737");
		
		fb.sendKeys(Keys.TAB);

	    String title = driver.getTitle();
	    
	    System.out.println(title); 


	}

	@Test

	public void youtubeHomePage(){

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Youtube

		driver.get("https://www.youtube.com/");

		WebElement youtube = driver.findElement(By.id("search"));

		youtube.sendKeys("SAHOO");
		
		youtube.sendKeys(Keys.ENTER);
		
	    String title = driver.getTitle();
	    
	    System.out.println(title); 




	}
}
