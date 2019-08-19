package CalenderTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class SpiceJetCalender {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open SpiceJet WebSite

		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");

		WebElement naresh = driver.findElement(By.id("datetimepicker"));
  
	    naresh.sendKeys("5052019");     
		
	    naresh.sendKeys(Keys.TAB);

	    naresh.sendKeys("1200AM");


	


	}

	
}
