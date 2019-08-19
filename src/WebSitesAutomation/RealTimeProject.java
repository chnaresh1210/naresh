package WebSitesAutomation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RealTimeProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

//		driver.get("https://www.irctc.co.in/nget/train-search");
	
//        Alert alert = driver.switchTo().alert();
//		
//		String title = driver.getTitle();
//        
//        System.out.println(title);
//		
//        alert.accept();		
//		
		
		
//		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
//		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("SECUNDERABAD-SC");
//		
//		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("ONGOLE-OGL");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).clear();
//		
//		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).sendKeys("26-07-2019");
////		
//		Select Dropdown = new Select( driver.findElement(By.className("ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted")));
////		
//	    Dropdown.selectByVisibleText("Sleeper (SL)");    
//		
//		driver.findElement(By.xpath("//input[@id='nlpAnswer']")).sendKeys("792I2D");
//		
//		driver.findElement(By.xpath("//button[text()='SIGN IN']]")).click();
//		
		
		driver.get("https://in.bookmyshow.com/hyderabad/movies/dear-comrade/ET00075421");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Book Tickets']")).click();
		
		
		
		driver.quit();
		
		
		
	}

}
