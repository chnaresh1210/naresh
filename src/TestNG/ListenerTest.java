package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.Listener.class)

public class ListenerTest {

	WebDriver driver;
	
	@BeforeMethod
	
	public void browserLaunch(){
		

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
		
	    driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
	
	}

@Test

public void demoAutomation(){
	
	driver.get("https://www.seleniumeasy.com/test/");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
}

@Test

public void openJQuaryPage(){
	
	driver.get("https://jqueryui.com/");
	
	String title = driver.getTitle();
	
	System.out.println(title);
}

}
