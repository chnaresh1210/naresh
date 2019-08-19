package AlertExamples;

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
		//		maximize browser
		driver.manage().window().maximize();
		//		launch browser
		//		driver.get("https://jqueryui.com/droppable/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		//		
		//		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		//
		//		Actions action = new Actions(driver);
		//		
		//		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		//		
//		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
//
//		driver.switchTo().frame(0);
//
//		WebElement sourceElement = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
//
//		WebElement targetElement = driver.findElement(By.xpath("//div[@id='mydropzone']"));
//
//		Actions action = new Actions(driver);
//
//		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
//

     driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
     
     driver.switchTo().frame(2);
              
     WebElement drag = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
     
     WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
     
     Actions action = new Actions(driver);
     
     Thread.sleep(3000);
     
	action.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	
	
	
	}

}
