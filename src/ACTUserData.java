// Java Program to illustrate reading from FileReader 
// using BufferedReader 
import java.io.*; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACTUserData 
{ 
public static void main(String[] args)throws Exception 
{ 
	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	WebDriver  driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get("http://partnerportal.actcorp.in/login");
	
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("kalyan010582@gmail.com");
	
	driver.findElement(By.xpath("//input[@name='passCode']")).sendKeys("110711");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='login100-form-btn']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//h1[text()=' Package Management']")).click();
	
	Thread.sleep(2000);
	
	
	
	File file = new File("C:\\Users\\suresh\\Desktop\\UserData.txt");

BufferedReader br = new BufferedReader(new FileReader(file)); 

String accountNumber; 
while ((accountNumber = br.readLine()) != null) {
	System.out.println("Searching for account number started:"+accountNumber); 
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='searchBox']")).clear();;
driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(accountNumber);
System.out.println("Searching for account number completed:"+accountNumber);
}
} 
} 