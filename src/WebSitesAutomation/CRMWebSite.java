package WebSitesAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CRMWebSite {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("naresh007");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
//		
        Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
//		
//		driver.findElement(By.xpath("//i[@class='edit icon']")).click();
//		
//		driver.findElement(By.name("first_name")).sendKeys("choppara");
//		
//		driver.findElement(By.name("middle_name")).sendKeys("naresh");
//		
//		driver.findElement(By.name("last_name")).sendKeys("kumar");
//		
//		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys("google");
//		
////		driver.findElement(By.xpath("//button[text()='Public']")).click();
//		
////		driver.findElement(By.name("//div[@class='twelve wide field']")).sendKeys("choppara naresh kumar");
//		
////		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple search selection dropdown']")).sendKeys("Google");
//		
//		driver.findElement(By.name("value")).sendKeys("chnaresh1210@gmail.com");
//		
//		driver.findElement(By.name("description")).sendKeys("hi.... this is naresh choppara");
//		
////		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple search selection dropdown']")).sendKeys("chnaresh1210@gmail.com");
//
////		Select dropdown = new Select(driver.findElement(By.className("search")));
//		
////		dropdown.selectByVisibleText("Indian/Maldives");
//		
////        driver.findElement(By.xpath("//div[@class='three fields']//span[text()='Facebook']")).click();		
////		
////        driver.findElement(By.xpath("//input[@placeholder='['")).sendKeys("chnaresh1210@gmail.com");
//        
//		driver.findElement(By.name("address")).sendKeys("karumanchi");
//		
//		driver.findElement(By.name("city")).sendKeys("ongole");
//		
//		driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
//		
//		driver.findElement(By.name("city")).sendKeys("ongole");
//		
//		driver.findElement(By.name("zip")).sendKeys("523272");
//		
////		Select dropdown = new Select(driver.findElement(By.xpath("//div[@name='country']//input[@class='search']")));
////		
////        dropdown.selectByIndex(7);
////        
////		
//		driver.findElement(By.name("position")).sendKeys("Selenium Automation Tester");
//		
//		driver.findElement(By.name("department")).sendKeys("Testing");
//		
////		driver.findElement(By.name("supervisor")).sendKeys("Selenium Team Leader");
//		
////		driver.findElement(By.name("assistant")).sendKeys("Junior Automation Tester");
//		
////		driver.findElement(By.name("referred_by")).sendKeys("Suresh choppara");
//		
//		driver.findElement(By.name("status")).sendKeys("New");
//		
//		driver.findElement(By.name("source")).sendKeys("Google");
//		
//		driver.findElement(By.name("category")).sendKeys("Contact");
//		
//		driver.findElement(By.name("day")).sendKeys("5");
//		
////		driver.findElement(By.xpath("//div[text()='Month']")).sendKeys("April");
//		
////		driver.findElement(By.name("year")).sendKeys("1990");
//		
//		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("A Mole On The Chest");
//		
//	    driver.findElement(By.name("image")).click();
//		
//		Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\hima.exe");
		
 
        driver.findElement(By.xpath("//span[text()='Contacts']")).click();
        
        driver.findElement(By.xpath("//button[text()='New']")).click();
        
        Thread.sleep(2000);
        
        Select dropdown = new Select(driver.findElement(By.xpath("//div[text()='Country']")));
        
        dropdown.selectByIndex(5);
        
        dropdown.selectByValue("2");
        
        dropdown.selectByVisibleText("India");
        
   
        
		
		
		
		
		
		
		
		
		
		
	}

}
