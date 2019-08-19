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

public class SeleniumFrameworkWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		
//		// New Browser window
//		
//		
//		driver.findElement(By.id("button1")).click();
//		
//		Thread.sleep(3000);
//		
//		Set<String> handel = driver.getWindowHandles();
//		
//		Iterator <String> naresh = handel.iterator();
//		
//		String parentwindow = naresh.next();
//		
//		System.out.println("parent window title:" +driver.getTitle());
//		
//		String childwindow = naresh.next();
//		
//		System.out.println("child window title:" +driver.getTitle());
//		
//		
//		driver.switchTo().window(childwindow);
//		
//		Thread.sleep(3000);
//		
//		driver.close();
//		
//		driver.switchTo().window(parentwindow);
//		
//		Thread.sleep(5000);
//		
//	
//		// New Message Window
//		
//		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
//		
//		Set <String> handel1 = driver.getWindowHandles();
//		
//		Iterator <String> choppara = handel1.iterator();
//		
//        String window = choppara.next();
//        
//        System.out.println("print current url:" + driver.getCurrentUrl());
//        
//        String door = choppara.next();
//        
//        System.out.println("print current url:" + driver.getTitle());
//        
//        driver.switchTo().window(door);
//        
//        Thread.sleep(3000);
//        
//        driver.close();
//        
//        Thread.sleep(3000);
//        
//        driver.switchTo().window(window);
//        
//       
//        Thread.sleep(5000);
//	
//    
//        // New Window Tab
//        
//        driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
//        
//        Set <String> handel2 = driver.getWindowHandles();
//        
//        Iterator <String> pradeep = handel2.iterator();
//        
//        String test = pradeep.next();
//        
//        System.out.println("display the value of test :" + driver.getCurrentUrl());
//        
//        String exam = pradeep.next();
//        
//        System.out.println("display the value of exam:"+ driver.getTitle());
//        
//        driver.switchTo().window(exam);
//        
//        driver.close();
//        
//        Thread.sleep(2000);
//        
//        driver.switchTo().window(test);
//	
        
        // Alert
//        
//        driver.findElement(By.id("alert")).click();
//        
//        Alert alert = driver.switchTo().alert();
//        
//        String str = alert.getText();
//        
//        System.out.println(str);
//        
//        Thread.sleep(3000);
//        
//        alert.accept();
//        
//        
//        // Timing alert
//        
//        driver.findElement(By.id("timingAlert")).click();
//        
//        Alert alert1 = driver.switchTo().alert();
//        
//        String str1 = alert1.getText();
//        
//        System.out.println(str1);
//        
//        Thread.sleep(3000);
//        
//        alert.accept();
//        
	
	    // Color Change
        
//        driver.findElement(By.id("colorVar")).click();
//	
//        Thread.sleep(2000);
//        
//        driver.findElement(By.id("doubleClick")).click();
	
	
	    // Drag and Drop
		
//				
//		Actions action = new Actions(driver);
//								
//
//		
//	    action.clickAndHold(driver.findElement(By.xpath("//button[@id='draga']"))).moveToElement(driver.findElement(By.xpath("//button[@id='dragb']"))).release().build().perform();
//	    
	    
		// Create a form
		
//		driver.findElement(By.name("name")).sendKeys("naresh choppara");
//	    
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("telephone")).sendKeys("9849108737");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("country")).sendKeys("India");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("company")).sendKeys("Student");
//	
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("message")).sendKeys("hi.. this is naresh choppara. i have learning selenium automation ");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[text()='Submit']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[3]")).click();
//		
	
	
	}

}
