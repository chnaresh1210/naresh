package AlertExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMovement {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//		maximize browser
		driver.manage().window().maximize();
		//		launch browser
		driver.get("https://www.makemytrip.com/");

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@class=' makeFlex hrtlCenter column']//span[@class='chNavIcon appendBottom2 chSprite chMore ']"))).build().perform();
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='appendBottom5 blackText'][contains(text(),'International Hotels')]")).click();
	
	
	}
}
