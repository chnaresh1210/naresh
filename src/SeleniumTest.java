import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

//		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
//		
//        String str= driver.getWindowHandle();
//        
//		driver.findElement(By.xpath("//a[text()='Cookie Policy']"));
//		
//		Set<String> naresh =driver.getWindowHandles();
//		
//		Iterator <String>iterator = naresh.iterator();
//		
//		while(iterator.hasNext())
//		{
//			String child = iterator.next();
//			driver.switchTo().window(child);
//		}
//
//			
//		driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().window(str);
//		
//		
//		
				driver.findElement(By.xpath("//input[@name='proceed']")).click();

				
//	Alert alert=driver.switchTo().alert();
//	
//	Thread.sleep(5000);
//	
//	String str = alert.getText();
//	
//	System.out.println(str);
//
//	alert.dismiss();
	
		//		driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul[1]/li[4]/a")).click();
	
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")).click();
		
//		driver.findElement(By.xpath("//*[@id='c']/ul/li/ul/li[4]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
