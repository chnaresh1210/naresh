package WebSitesAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LetsKodiItWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		
		
		// Switch window example
	/*	
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.id("openwindow")).click();
		
		Set <String> naresh = driver.getWindowHandles();
		
		Iterator <String> choppara = naresh.iterator();
		
		String parentwindow = choppara.next();
		
		System.out.println("parent window dispaly the title:" + driver.getTitle());
		
		String childwindow = choppara.next();
		
		System.out.println("child window display the current url:" + driver.getCurrentUrl());

		driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		*/
		
		
		// switch tab
		
		/*
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		
		Set <String> naresh = driver.getWindowHandles();
		
		Iterator <String> choppara = naresh.iterator();
		
		String parentwindow = choppara.next();
		
		System.out.println("parent window dispaly the title:" + driver.getTitle());
		
		String childwindow = choppara.next();
		
		System.out.println("child window display the current url:" + driver.getCurrentUrl());

		driver.switchTo().window(childwindow);
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		
		*/
		
		// Alert
		
	/*	
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.name("enter-name")).sendKeys("naresh choppara");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.accept();
						
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmbtn")).click();
		
		Thread.sleep(2000);
		
		alert.accept();
		
		*/
		
		
		// Radio Button Example

	/*	
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("bmwradio")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("benzradio")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hondaradio")).click();
	
	*/
	    
	/*	
		
		// Select Class Example
		
		driver.get("https://letskodeit.teachable.com/p/practice");
	
		WebElement element = driver.findElement(By.id("carselect"));
		
		Select cars = new Select(element);
		
		cars.selectByIndex(0);
	    
		Thread.sleep(2000);
		
		cars.selectByIndex(1);
						
		Thread.sleep(2000);
		
		cars.selectByIndex(2);
		
		*/
	
	
	// Multiple Select Example
		
	
    /*		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.xpath("//option[text()='Apple']")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//option[text()='Orange']")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//option[text()='Peach']")).click();
	
	*/
	
		
		// Check box
		
		/*
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.id("bmwcheck")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("benzcheck")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.id("hondacheck")).click();
	
	
	*/
	
	
		/*
		
		// Element Show/Hide
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("displayed-text")).sendKeys("naresh choppara");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("show-textbox")).click();
		
		*/
		
		
		// Mouse Hover
		
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		
//		driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='//a[text()='Reload']']")).click();
		
		
		
		
		
		
		
		
		
	}

}
