package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTourWeSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
	    driver.findElement(By.name("firstName")).sendKeys("choppara");
	   
	    driver.findElement(By.name("lastName")).sendKeys("naresh");
	    
	    driver.findElement(By.name("phone")).sendKeys("9849108737");
	    
	    driver.findElement(By.name("userName")).sendKeys("chnaresh1210@gmail.com");
	    
	    driver.findElement(By.name("address1")).sendKeys("karumanchi post and village");
	    
	    driver.findElement(By.name("address2")).sendKeys("tangutur");
	    
	    driver.findElement(By.name("city")).sendKeys("ongole");
	    
	    driver.findElement(By.name("state")).sendKeys("Andhra pradesh");
	
	    driver.findElement(By.name("postalCode")).sendKeys("523272");
	    
	    WebElement dropdown = driver.findElement(By.name("country"));
	    
	    Select naresh = new Select(dropdown);
	    
	    naresh.selectByVisibleText("INDIA");   
	 
	    driver.findElement(By.name("email")).sendKeys("naresh choppara"); 
	
	    driver.findElement(By.name("password")).sendKeys("naresh007");
	    
	    driver.findElement(By.name("password")).sendKeys("naresh007");
	
	    driver.findElement(By.name("register")).click();
	
	
	
	
	
	
	
	
	
	}
	
	
}
