package ACTcableUserData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriberDetails {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://partnerportal.actcorp.in/login");

		// Login Act Cable site

		driver.findElement(By.name("userName")).sendKeys("kalyan010582@gmail.com");

		driver.findElement(By.name("passCode")).sendKeys("110711");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// click on the package management

		driver.findElement(By.xpath("//h1[text()=' Package Management']")).click();

		// Search subscriber list
		
    	driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("12674784");

       	driver.findElement(By.xpath("//input[@id='searchAccPhMac']")).click();
    	
    	// click on the subscribers MAC id
    	
    	driver.findElement(By.xpath("//a[contains(text(),'111409024125')]")).click();
    	
    	// click on the subscriber plan/package
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Currently Subscribed Packs/Channels ')]")).click();
    	
    /*
    	
    	// package
    	
    	driver.findElement(By.xpath("//label[text()='ADDON_ALA_NICK']")).click();
    	
    	System.out.println("package name:"+driver.findElement(By.xpath("//label[text()='ADDON_ALA_NICK']")).getText());
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//label[text()='ADDON_ALA_CNN']")).click();
    	
    	System.out.println("package name:"+driver.findElement(By.xpath("//label[text()='ADDON_ALA_CNN']")).getText());
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//label[text()='ADDON_BOQ_TVT_BAS']")).click();
    	
    	System.out.println("package name:"+driver.findElement(By.xpath("//label[text()='ADDON_BOQ_TVT_BAS']")).getText());
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//label[text()='ADDON_BOQ_ACT VALUE PLAN']")).click();
    	
    	System.out.println("package name:"+driver.findElement(By.xpath("//label[text()='ADDON_BOQ_ACT VALUE PLAN']")).getText());
    
    	*/
     	
    	// Using HTML Table format
    	
    	// 1.table details
    	
    	driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[1]/td[2]")).click();
    	
    	System.out.println("package name:" +driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[1]/td[2]")).getText());
    	
    	
    	// 2. table details
    	
    	driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[2]/td[2]")).click();
    	
    	System.out.println("package name:" +driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[2]/td[2]")).getText());
    	
    	
    	// 3. table details
    	
    	driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[3]/td[2]")).click();
    	
    	System.out.println("package name:" +driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[3]/td[2]")).getText());
    	
    	
    	// 4.table details
    	
    	driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[4]/td[2]")).click();
    	
    	System.out.println("package name:" +driver.findElement(By.xpath("//div[@id='subListDiv']/table/tbody/tr[4]/td[2]")).getText());
    	
    	
    	
    	
	}
}
