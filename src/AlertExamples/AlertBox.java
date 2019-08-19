package AlertExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//	maximize browser
	driver.manage().window().maximize();
//	
//// launch rediff email page
//	driver.get("https://popupally.com/blog/generate-more-leads/popups/best-pop-up-examples/");
//	
////	clicking  on GO button
//	driver.findElement(By.className("//div[@class='popupally-pro-close popup-click-close-trigger-24']")).click();
//	
////	creating Alert Interface
//	Alert alert = driver.switchTo().alert();
//
//	String str = alert.getText();
//                                                                               	 //this is one method let see another method
//	Thread.sleep(5000);
//	
//	System.out.println(str);
//	
//	alert.accept();

	
	////	storing expected alert message
//	String ExpectedMessage= ("Please enter a valid user name");
//
////	get text message of alert box
//	String ActualMessage = alert.getText();                                    
//	
////	putting execution of time in 5 sec sleep
//	Thread.sleep(5000);
//	
////	comparing expected and actual .if matches click dismiss button
//	if( ExpectedMessage.equals( ActualMessage))
//	{
//		alert.accept();
//	}
//	

	driver.get("https://www.seleniumeasy.com/test/");
	
//	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]")).click();
//	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap Alerts')]")).click();
//	
//	driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']")).click();

//    driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap Modals')]")).click();
    
//    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    
//    driver.findElement(By.xpath("//a[@class='btn']")).click();
	
//	    
//    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	                                                                                                              //completed alerts and modals
//    driver.findElement(By.xpath("//a[@class='btn']")).click();
//	
	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Window Popup Modal')]")).click();
	
//	driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']")).click();
	
//	driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Facebook']")).click();
//	
//	driver.findElement(By.xpath("//a[contains(text(),'Follow Twitter & Facebook')]")).click();
	

//	driver.findElement(By.xpath("//a[@id='followall']")).click();
	
//	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'List Box')]")).click();
//	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap List Box')]")).click();
//	
//	driver.findElement(By.xpath("//ul[@class='list-group']//li[contains(text(),'bootstrap-duallist ')]")).click();
//	
//	driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-right']")).click();
//	
//	driver.findElement(By.xpath("//ul[@class='list-group']//li[contains(text(),'Cras justo odio')]")).click();
//	
//	driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();

	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery List Box')]")).click();
	
//	driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']//option[contains(text(),'Sophia')]")).click();
//	
//	driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();
	
//	driver.findElement(By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']")).click();
//	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.xpath("//button[@class='pRemoveAll btn btn-primary btn-sm']")).click();
//	
	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Data List Filter')]")).click();
	
//	driver.findElement(By.xpath("//input[@id='input-search']")).sendKeys("Name: Tyreese Burn");
	
//	driver.findElement(By.xpath("//input[@id='input-search']")).sendKeys("Glenn Pho shizzle");
	
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Others')]")).click();
	
//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Drag and Drop')]")).click();
	
//	driver.findElement(By.xpath("//div[@id='todrag']//span[contains(text(),'Draggable 2')]")).click();
	
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Charts Demo')]")).click();
	
//	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
//	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
	
	
	
	
	}

}
