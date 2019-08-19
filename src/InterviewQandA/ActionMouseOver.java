package InterviewQandA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bankersadda.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Interview']"))).build().perform();

		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[text()='Success Stories']")).click();
	
	
	}

}
