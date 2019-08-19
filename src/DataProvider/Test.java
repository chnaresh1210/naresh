package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("choppara.naresh@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kmcnaresh");
		
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
