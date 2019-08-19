package InterviewQandA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
	    driver.manage().window().maximize();
	    
//	    driver.switchTo().frame(0);
	  
	    
	    Actions action = new Actions(driver);
	    
	    	    
//	    action.clickAndHold(driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]")))
//	    .moveToElement(driver.findElement(By.xpath("//div[@id='mydropzone']")))
//	    .release()
//	    .build()
//	    .perform();
//	    
	    
	    WebElement from = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	    
	    WebElement to = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	    
	    action.dragAndDrop(from, to).build().perform();
	    
	    
	
	}

}
