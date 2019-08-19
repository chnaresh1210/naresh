package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickandRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		
		/*
		
        Actions action = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	
	    action.contextClick(rightclick).build().perform();
	
	    WebElement copy = driver.findElement(By.xpath("//div[text()='Favourites']"));
	    
	    String text = copy.getText();
	    
	    System.out.println(text);
	    
	    copy.click();
	
	
		
//    double click
	    
	
	
//	action.clickAndHold(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).doubleClick().perform();
	
		*/

		/*
	
	  Actions action = new Actions(driver);
	  
	  WebElement ch = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	  
	  action.contextClick(ch).build().perform();
	  
	  driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
	  
	  Alert alert = driver.switchTo().alert();
	  
	  String text = alert.getText();
	  
	  System.out.println(text);
	  
	  Thread.sleep(2000); 
	
	  alert.accept();
	
	
	*/
		
		WebElement naresh = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(naresh).build().perform();
	
		
		
	    Alert alert = driver.switchTo().alert();
	    
	    String text = alert.getText();
	    
	    System.out.println(text);
	
	    Thread.sleep(2000);
	    
        alert.accept();
	
	}  
	
	
	

}
