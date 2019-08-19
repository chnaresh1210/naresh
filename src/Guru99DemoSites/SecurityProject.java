package Guru99DemoSites;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecurityProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// open Security project 
		driver.get("http://demo.guru99.com/Security/SEC_V1/index.php");

		driver.findElement(By.name("uid")).sendKeys("1303");

		driver.findElement(By.name("password")).sendKeys("Guru99");

		driver.findElement(By.name("btnLogin")).click();

		// Balance Enquiry
		driver.findElement(By.xpath("//a[contains(text(),'Balance Enquiry')]")).click();

         Thread.sleep(2000);
		
		// 3308 check mini statement		
		driver.findElement(By.xpath("//option[contains(text(),'3308')]")).click();

		driver.findElement(By.name("AccSubmit")).click();

		//  back to  home page
		driver.navigate().back();

		Thread.sleep(5000);

		//  3309 check mini statement
		driver.findElement(By.xpath("//option[contains(text(),'3309')]")).click();

		driver.findElement(By.name("AccSubmit")).click();

        List<WebElement> pradeep = driver.findElements(By.tagName("tbody"));
		
		System.out.println(pradeep.size());
		
		for(int i=0; i<=pradeep.size();i++){
			
			String ch = pradeep.get(i).getText();
			
			System.out.println(ch);
		
		Thread.sleep(2000);

		// Mini Statement
		driver.findElement(By.xpath("//a[contains(text(),'Mini Statement')]")).click();

		// 3308 check mini statement		
		driver.findElement(By.xpath("//option[contains(text(),'3308')]")).click();

		driver.findElement(By.name("AccSubmit")).click();

		Thread.sleep(5000);
		
		List<WebElement> naresh = driver.findElements(By.tagName("tbody"));
		
		System.out.println(naresh.size());
		
		for(int j=0; j<=naresh.size();j++){
			
			String choppara = naresh.get(j).getText();
			
			System.out.println(choppara);
		
		
		Thread.sleep(2000);
		
		//  back to  home page
		driver.navigate().back();

		Thread.sleep(5000);

		//  3309 check mini statement
		driver.findElement(By.xpath("//option[contains(text(),'3309')]")).click();

		driver.findElement(By.name("AccSubmit")).click();

     
		// Contact Us
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		Thread.sleep(2000);
		
		// customer details
		driver.findElement(By.name("name")).sendKeys("naresh");
		
		driver.findElement(By.name("emailid")).sendKeys("chnaresh1210@gmail.com");
		
		driver.findElement(By.name("telephoneno")).sendKeys("9849108737");
		
		driver.findElement(By.name("addr")).sendKeys("hi hello naresh choppara");
		
		driver.findElement(By.name("fileToUpload")).sendKeys("C:\\Users\\suresh\\Desktop\\naresh.jpg");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("sub")).click();
		
		
		Thread.sleep(5000);
		
		}
	
		
		
		// LogOut from Security project
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
		}	









		}
	



}