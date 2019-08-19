package TestNG;

import java.util.concurrent.TimeUnit;







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG {

    WebDriver driver;
	
	@BeforeTest
	
	public void HomePage(){
	
	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

    driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.manage().deleteAllCookies();

	// Guru99 Dynamic table
	
	driver.get("https://www.google.com/");
}

  /*  @Test                                     Basic TestNG
    
    public void HomePageTitle(){
    	
    	String expectedtitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
    	
    	String actualtitle = driver.getTitle();
    	
        Assert.assertEquals(actualtitle, expectedtitle);
        	
        
    }

    */
    
	
	@Test  (priority=3)
	
	public void openYoutube(){
		
		driver.navigate().to("https://www.youtube.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
    @Test (priority=2)
	
	public void openFacebook(){
		
		driver.navigate().to("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	}
	
	
   @Test (priority=1)
	
	public void openBookMyShow(){
		
		driver.navigate().to("https://in.bookmyshow.com/hyderabad");
		
		String wh = driver.getWindowHandle();
		
		System.out.println(wh);
	}
	
	
	
    @AfterTest
    
    public void closeBrowser(){
    	
    	driver.quit();
    }

    
  


}
