package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		//1. Drag and drop
		//		driver.get("https://jqueryui.com/droppable/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Actions action = new Actions(driver); 
		//				
		//		Thread.sleep(2000);
		//		
		//		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform(); 


		// 2.resize

		//		driver.get("https://jqueryui.com/resizable/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Actions action = new Actions(driver);
		//		
		//		WebElement drag = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		//		
		//		Thread.sleep(3000);
		//		
		//		action.clickAndHold(drag).moveByOffset(60, 60).release(drag).build().perform();
		//		

		// 3.Selectable

		//		driver.get("https://jqueryui.com/selectable/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Actions action = new Actions(driver);
		//		
		//		driver.findElement(By.xpath("//li[text()='Item 5']")).click();
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//li[text()='Item 6']")).click();
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//li[text()='Item 2']")).click();
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.quit();

		// 4.Soartable


		//		driver.get("https://jqueryui.com/sortable/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Actions action = new Actions(driver);
		//		
		//	    WebElement drag = driver.findElement(By.xpath("//li[text()='Item 7']"));
		//	    
		//	    Thread.sleep(3000);
		//	    
		//	    WebElement drop = driver.findElement(By.xpath("//li[text()='Item 1']"));
		//	    
		//	    Thread.sleep(3000);
		//	    
		//	    action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		//	
		//	    Thread.sleep(5000);
		//	    
		//	    driver.quit();


		// Effects--> AddClass

		//		driver.get("https://jqueryui.com/addClass/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Actions action = new Actions(driver);
		//		
		//		Thread.sleep(3000);
		//		
		//		 driver.findElement(By.xpath("//button[@id='button']")).click();
		//		
		//		action.contextClick(click);
		//	
		//		
		//		 
		//		 Thread.sleep(5000);
		//		
		//	    driver.quit();
		//		
		// Color animation

		//		driver.get("https://jqueryui.com/animate/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//button[@id='button']")).click();
		//		


		// Easing

		//		driver.get("https://jqueryui.com/easing/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//div[@id='graphs']//div[1]//canvas[1]")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//body//div[2]//div[2]//canvas[1]")).click();
		//	
		//	    Thread.sleep(5000);
		//	    
		//	    driver.findElement(By.xpath("//div[3]//div[2]//canvas[1]")).click();
		//	
		//	    Thread.sleep(5000);
		//	    
		//	    driver.quit();


		// Hide

		//		driver.get("https://jqueryui.com/hide/");
		//		
		//		driver.switchTo().frame(0);
		//			
		//		driver.findElement(By.xpath("//option[text()='Bounce']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Blind']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Clip']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Drop']")).click();
		//
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Explode']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Fade']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//option[text()='Fold']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Highlight']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Puff']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Pulsate']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Scale']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Shake']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//option[text()='Size']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//		driver.findElement(By.xpath("//option[text()='Slide']")).click();
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
		//		
		//		Thread.sleep(5000);
		//		
		//							
		//	    driver.quit();
		//	


		// RemoveClass
		//		
		//		driver.get("https://jqueryui.com/removeClass/");
		//		
		//		driver.switchTo().frame(0);
		//		
		//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();



		// Show

//		driver.get("https://jqueryui.com/show/");
//
//		driver.switchTo().frame(0);
//
//
//		driver.findElement(By.xpath("//option[text()='Bounce']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Blind']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Clip']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Drop']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Explode']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Fade']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//option[text()='Fold']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Highlight']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Puff']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Pulsate']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Scale']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Shake']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//
//
//		driver.findElement(By.xpath("//option[text()='Size']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//option[text()='Slide']")).click();
//
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
//
//		Thread.sleep(5000);


      // Switch class
		
//		driver.get("https://jqueryui.com/switchClass/");
//		
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.xpath("//button[text()='Run Effect']")).click();


       // Widget
		
		driver.get("https://jqueryui.com/widget/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='my-widget1']//button[@class='custom-colorize-changer ui-button ui-corner-all ui-widget'][contains(text(),'change')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='my-widget2']//button[@class='custom-colorize-changer ui-button ui-corner-all ui-widget'][contains(text(),'change')]")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='my-widget3']//button[@class='custom-colorize-changer ui-button ui-corner-all ui-widget'][contains(text(),'change')]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("disable")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("green")).click();

		Thread.sleep(2000);
		
		driver.quit();





	}

}
