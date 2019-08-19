package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingWhiz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\gecko_driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Testing Whiz web Site
		
		driver.get("https://www.testing-whiz.com/request-a-testingwhiz-demo");
		
		driver.findElement(By.name("txtName")).sendKeys("naresh");

		driver.findElement(By.name("txtLastName")).sendKeys("choppara");

		driver.findElement(By.name("txtEmail")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.name("txtCompany")).sendKeys("none");

		driver.findElement(By.name("txtContactNo")).sendKeys("9849108737");

		Select ind = new Select(driver.findElement(By.name("ddlCountry")));  
		
		ind.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//label[@for='ChkPrivayPolicy']")).click();
		
		driver.findElement(By.xpath("//label[@for='ChkProductUpdate']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
