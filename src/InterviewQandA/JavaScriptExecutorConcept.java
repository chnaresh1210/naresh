package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("naresh007");
		
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
	
	
	WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login']"));
	
	flash(loginbtn,driver);
	
	
	
	
	}

	
	public static void flash(WebElement element, WebDriver driver){
		
		JavaScriptExecutor js = ((JavaScriptExecutor)driver);
		
		String bgcolor  = element.getCssValue("backgroundcolor");
		
		for(int i=0; i<10; i++){
		
			changeColor("rgb(0,200,0)",element , driver);
			
			changeColor(bgcolor,element, driver);
		}
				
				
	}


	public static void changeColor(String color, WebElement element, WebDriver driver) {
	
		JavaScriptExecutor js = ((JavaScriptExecutor)driver);
		
	 ((JavascriptExecutor) js).executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
	
	    try{
	    	Thread.sleep(20);
	    	
	    }catch (InterruptedException e){
	    	
	    }
	
	}
	
}
