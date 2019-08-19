import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DemoSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

		//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naresh");
		//		
		//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("choppara");
		//	
		//		driver.findElement(By.xpath("//input[@id='sex-0']")).sendKeys("Male");	
		//	
		//		driver.findElement(By.xpath("//input[@id='exp-0']")).sendKeys("5");
		//
		//	    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("7/12/2019");
		//	    
		//	    driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		//	    
		//	    driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("E:\\Naresh\\Sreedhars cce exam");
		//	    
		//	    Thread.sleep(10000);
		//	    
		//	    driver.findElement(By.xpath("//a[text()='Selenium Automation Hybrid Framework']")).click();
		//	    
		//	    Thread.sleep(5000);
		//	    
		//	    driver.findElement(By.xpath("//a[text()='Test File to Download']")).click();
		//	    
		//	    driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
		//	    
		//	    Thread.sleep(3000);
		//	    
		//	// Drop and Drop
		//	    Select select = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		//	    
		////	    select.selectByVisibleText("Asia");
		//	    
		//	    select.selectByIndex(4);
		//	    
		//   //Drop and Down
		//	    Thread.sleep(3000);
		//	    
		//         Select select1 = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		//	    
		//	     select1.selectByVisibleText("Wait Commands");
		//	      
		////         select.selectByIndex(3);
		//         
		//	     Thread.sleep(5000);
		//	     
		//	     driver.findElement(By.xpath("//button[@id='submit']")).click();
		//	    
		//		driver.findElement(By.xpath("//nav[@class='navigation']//ul[@id='primary-menu']//span[contains(text(),'DEMO SITES')]")).click();
		//		
		//	    driver.findElement(By.xpath("//nav[@class='navigation']//span[@class='menu-item-text']//span[text()='Automation Practice Switch Windows']")).click();
		//	
		//	    driver.findElement(By.xpath("//button[@id='button1']")).click();
		//	    
		//	    Thread.sleep(3000);
		//	
		//	    driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
		//	    
		//	    Thread.sleep(3000);
		//	    
		//	    driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
		//	    
		//	    Thread.sleep(3000);
//		//	    
//			    driver.findElement(By.xpath("//a[@class='pm-cta']")).click();
//			    
//			    Alert alert= driver.switchTo().alert();
//			 			  			    
//			    System.out.println(alert.getText());
//			 
//			    Thread.sleep(3000);
//			    
//			    alert.dismiss();	
//			
		//	    if(alert.equals(driver))
		//	    {
		//	    	System.out.println("accepted");
		//	    }
		//	    else{
		//	    	System.out.println("not accepted");
		//	    }


//		driver.findElement(By.id("colorVar")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("doubleClick")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("disabledElement")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("invisibility")).click();


       driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).sendKeys("13/07/2019");
       
       driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("01/07/2019");

       driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("13/07/2019");
		
		
		
	}

}
