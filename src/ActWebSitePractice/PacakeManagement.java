package ActWebSitePractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PacakeManagement {

	public static void main(String[] args) throws InterruptedException {
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

		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//h1[text()=' Package Management']")).click();
        
        driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("12674784");

        driver.findElement(By.xpath("//input[@id='searchAccPhMac']")).click();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()='111409024125']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id='accordion4']//div[@class='panel panel-default']//div[@id='headingOne']//a[@role='button']")).click();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='searchSubsPackChannel']")).sendKeys("NICK");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='searchSubsPackChannel']")).clear();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='searchSubsPackChannel']")).sendKeys("ACT VALUE PLAN");
        
        Thread.sleep(2000);
         
        driver.findElement(By.xpath("//a[contains(text(),'Subscribe - Broadcaster Bouquet')]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='searchPack']")).sendKeys("TVT Hindi News Bouquet"); // 0.86
        
        Thread.sleep(2000);
                              
        // Add Pack TVT Hindi News Bouquet channel   
        
        driver.findElement(By.xpath("//input[@id='boq186']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Subscribe - A la Carte ')]")).click();
        
        driver.findElement(By.xpath("//input[@id='searchChannel']")).sendKeys("CNN International");  // 0.43

        // Add CNN International channel
        
        driver.findElement(By.xpath("//input[@id='chan17']")).click();
        
        Thread.sleep(5000);
        
        // click on add cart to pay the selected package amount
        
        driver.findElement(By.xpath("//button[contains(text(),' View Cart ')]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to Check Out ')]")).click();
        
        driver.quit();


	}

}
