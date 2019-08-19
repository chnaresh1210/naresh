package NavigateBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");

		String title = driver.getTitle(); 

		System.out.println(title);	    

		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");

		String url = driver.getCurrentUrl();

		System.out.println(url);		

		Thread.sleep(3000);
		
		driver.navigate().back();

		Thread.sleep(3000);
		
		driver.navigate().forward();

		Thread.sleep(3000);
		
		driver.navigate().back();
		
	




	}
}
