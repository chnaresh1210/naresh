package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionOnPage {


	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoutmeloud.com/copy-from-right-click-disabled-websites.html");
	
//		driver.findElement(By.xpath("//span[@class='sprite close dark']"));
		
		Alert alert = driver.switchTo().alert();
		
		String str=driver.getTitle();
		
		System.out.println("Printing the title of alert as :: "+str);
		
		alert.dismiss();
		
		
		
		
		
//	  Actions action = new Actions(driver);
//	  
//	  action.moveToElement(driver.findElement(By.className("link"))).build().perform();
//	  
//	  Thread.sleep(3000);
//	  
//	  driver.findElement(By.xpath("//a[text()='Corporate Accounts']")).click();
//	  
	  
	
	}
	
	}


