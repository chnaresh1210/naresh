package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import Flash.FlashObjectWebDriver;

public class FlashDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Open firefox browser		
		System.setProperty("webdriver.gecko.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\gecko_driver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();			
	  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Maximize browser		
		driver.manage().window().maximize();		
	  	
		// Under Flash jar file there is separate FlashObjectWebDriver class		
		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");		
	  	
		// Pass the URL of video		
		
		driver.get("http://demo.guru99.com/test/flash-testing.html");			
		
		Thread.sleep(5000);		
	  	
		flashApp.callFlashObject("Play");			
	  	
		Thread.sleep(5000);		
		
		flashApp.callFlashObject("StopPlay");			
		
		Thread.sleep(5000);		
		
		flashApp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
	    
		System.out.println(flashApp.callFlashObject("GetVariable","/:message"));						
	  }	
	
	}


