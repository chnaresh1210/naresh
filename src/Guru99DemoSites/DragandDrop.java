package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement a = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));

		WebElement b = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));

		
		WebElement c = driver.findElement(By.xpath("//li[@id='credit2']"));

		WebElement d = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

		
		WebElement e = driver.findElement(By.xpath("//li[@id='credit4']"));

		WebElement f = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
 
		
		WebElement g = driver.findElement(By.xpath("//li[@id='credit0']"));

		WebElement h = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		
		
    	Actions action = new Actions(driver);

		Thread.sleep(2000);

		action.clickAndHold(a).moveToElement(b).release().build().perform();

		Thread.sleep(5000);

		action.clickAndHold(c).moveToElement(d).release().build().perform();

        Thread.sleep(5000);

//        action.clickAndHold(e).moveToElement(f).release().build().perform();  
//	
//	    Thread.sleep(5000);
//	
//	    action.clickAndHold(g).moveToElement(h).release().build().perform();
//	
//	
	
	
	
	
	
	
	}

}
