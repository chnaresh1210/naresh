package FileUpLoad;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.filemail.com/");
			
			driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("choppara.naresh@gmail.com");
			
			driver.findElement(By.xpath("//input[@id='FilemailFrom']")).sendKeys("chnaresh1210@gmail.com");
	
			driver.findElement(By.xpath("//input[@id='FilemailSubject']")).sendKeys("hiiiiiiiiiiiii");
			
			driver.findElement(By.xpath("//textarea[@id='FilemailMessage']")).sendKeys("hi naresh choppara");
	
	        driver.findElement(By.xpath("//button[@id='addBtn']")).click();
	        
			Thread.sleep(5000);
			
			Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\naresh.exe");
			
	
	
	}

}
