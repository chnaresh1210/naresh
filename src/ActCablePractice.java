import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActCablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		driver.get("http://partnerportal.actcorp.in/login");
		
		driver.findElement(By.name("userName")).sendKeys("kalyan010582@gmail.com");
		
		driver.findElement(By.name("passCode")).sendKeys("110711");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//h1[text()=' Package Management']")).click();
        
        driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("12674784");

        driver.findElement(By.xpath("//input[@id='searchAccPhMac']")).click();

        driver.findElement(By.xpath("//a[text()='111409024125']")).click();
        
        driver.findElement(By.xpath("//div[@id='accordion4']//div[@class='panel panel-default']//div[@id='headingOne']//a[@role='button']")).click();

        driver.quit();


	}

}
