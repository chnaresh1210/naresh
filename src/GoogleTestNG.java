import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GoogleTestNG {

	WebDriver driver;

//	https://www.google.com/
//		PASSED: googleTitle
//		PASSED: google
//		PASSED: selectImages
//		PASSED: GmailLink                    //zig-zag priority
//		PASSED: logoSearch
//		PASSED: googleurl
//	

	
	
//	Google
//	PASSED: GmailLink
//	PASSED: selectImages
//	PASSED: logoSearch
//	PASSED: google                         //reverse priority
//	PASSED: googleurl
//	PASSED: googleTitle
	
	@BeforeMethod

	public void setUp(){

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
	}


	@Test (priority=6,groups="Title")

	public void googleTitle(){

		String str = driver.getTitle();
		System.out.println(str);
	}

	@Test (priority=5,groups="Title")

	public void googleurl(){

		String str = driver.getCurrentUrl();
		System.out.println(str);
 
	}

	@Test (priority=4,groups="Title")

	public void google(){

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");

	}



	@Test (priority=3,groups="Search")

	public void logoSearch(){

		boolean a=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}

	@Test (priority=2,groups="Search")

	public void selectImages(){

		boolean c=driver.findElement(By.xpath("//a[@class='gb_d'][contains(text(),'Images')]")).isDisplayed();
	
		  
		
	}

	@Test (priority=1,groups="Gmail link")

	public void GmailLink(){

		boolean b=driver.findElement(By.xpath("//a[@class='gb_d'][contains(text(),'Gmail')]")).isDisplayed();
	}

	@AfterMethod

	public void closeBrowser(){
		driver.quit();
	}














}









