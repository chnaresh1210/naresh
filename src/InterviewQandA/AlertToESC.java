package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertToESC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().getCookies();
	
		// Acepte alert through ESAPE using FunctionEnum---(  sendKeys(Keys.ESC);  )
		
		/*
		
	    WebElement naresh = driver.findElement(By.name("proceed"));
	
	    naresh.click();
	    
	    Thread.sleep(2000);
	    
	    naresh.sendKeys(Keys.ESCAPE);
	    
	    */
		
		// Regular Method
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		alt.accept();
		
		
	} 
	  
	 
	}

	
	

