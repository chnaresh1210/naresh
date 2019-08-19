package InterviewQandA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();

		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdjBx6QpySfobn6PqmjfpM4yx-UGe0noYHMc6ndia1vUDOG4eh-GRSCS724FJYTBWcyPYZETsAZ9uFFhD4RHPY_roVSUwX1ikic0WV0zy0gJA&smuh=691&lh=Ac__LeDewZppockC");
		
		System.out.println("Before login page title:"+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9849108737");
			
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kmc007");;
						
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
						
		System.out.println("After login page title:"+driver.getTitle());
		
					
				
		
	}

}
