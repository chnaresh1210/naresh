package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollDownandUp {

@Test

public void ScrollDownUp() throws InterruptedException{
		
	    System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

//		driver.get("http://demo.guru99.com/test/guru99home");
		
		/*
		
		//scroll down
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
        //scroll up
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		*/
		
		/*
		
		// page down untill element identify
		
		driver.get("http://demo.guru99.com/test/guru99home");
		
		WebElement naresh = driver.findElement(By.xpath("//a[contains(text(),'Software Testing')]"));
		
          JavascriptExecutor js  = (JavascriptExecutor)driver;		
		
		 js.executeScript("arguments[0].scrollIntoView();", naresh);
		
		*/
		
		/*
		
		// Horizantal scroll
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		WebElement choppara = driver.findElement(By.linkText("VBScript"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();" ,choppara);
		
		*/
		
		driver.get("https://naasongs.com/saaho-2019.html");
		
//		WebElement hima = driver.findElement(By.linkText("VBScript"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
	}
}
