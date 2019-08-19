package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		// Your LogaWomen Shopping Store

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@class='login']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("chnaresh1210@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("passwd")).sendKeys("naresh007");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();


		// Start Item Selection


		//		driver.findElement(By.xpath("//a[text()='My orders']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//tr[contains(@class,'first_item')]//i[@class='icon-chevron-right right']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//span[contains(text(),'Reorder')]//i[@class='icon-chevron-right right']")).click();
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		//		
		//		Thread.sleep(2000);		
		//		
		//		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//        driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		//        
		//        Thread.sleep(2000);
		//        
		//        driver.findElement(By.xpath("//a[@class='bankwire']")).click();	
		//		
		//        Thread.sleep(2000);
		//        
		//		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		//	


             // Printed dress Selection
		
		driver.findElement(By.id("search_query_top")).sendKeys("Printed summer Dress");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit_search")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();

		








	}

}
