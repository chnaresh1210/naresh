package InterviewQandA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().to("https://www.facebook.com/");
	
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
	
	
	
	
	}
	
	

}
