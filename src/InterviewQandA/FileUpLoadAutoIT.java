package InterviewQandA;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.filemail.com/");
	
	    driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("choppara.naresh@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='FilemailFrom']")).sendKeys("chnaresh1210@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='FilemailSubject']")).sendKeys("choppara.naresh@gmail.com"); 
	
	    driver.findElement(By.xpath("//textarea[@id='FilemailMessage']")).sendKeys("choppara.naresh@gmail.com");
	    
	    driver.findElement(By.xpath("//button[@id='addBtn']")).click();
	    
	    Thread.sleep(3000);
	    
	    Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\padma.exe");
	    
	
	
	
	
	
	
	
	
	}

}
