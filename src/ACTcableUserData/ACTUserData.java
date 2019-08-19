package ACTcableUserData;
// Java Program to illustrate reading from FileReader 
// using BufferedReader 
import java.io.*; 
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACTUserData 
{ 
	
	static WebDriver  driver =null;
	static Properties properties=new Properties();
	static Properties properties1=new Properties();  
public static void main(String[] args)throws Exception 
{ 
	System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	
	 FileReader reader=new FileReader("C:\\Users\\suresh\\Desktop\\PackageinfoActualCost.properties");  
     properties.load(reader);  
	 
     FileReader reader1=new FileReader("C:\\Users\\suresh\\Desktop\\PackageinfoAmountCollection.properties");  
     properties1.load(reader1);  
	 

	    
//	driver = new ChromeDriver();
	driver = new ChromeDriver();

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
driver.findElement(By.xpath("//input[@id='searchBox']")).clear();
driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(accountNumber);
enableSearch(accountNumber);
System.out.println("Searching for account number completed:"+accountNumber);


}
}

public static void enableSearch(String accountNumber) {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//input[@id='searchAccPhMac']")).click();
	
	driver.findElement(By.xpath("//*[@id='recharge']/div[2]/div[3]/table/tbody/tr[2]/td[1]/div/a")).click();
	//a[contains(text(),'Currently Subscribed Packs/Channels')]
	driver.findElement(By.xpath("//a[contains(text(),'Currently Subscribed Packs/Channels')]")).click();
//	driver.findElement(By.xpath("//*[@id='subListDiv']/table/tbody/tr[1]/td[2]/label")).click();
//	System.out.println("Package Name:"+driver.findElement(By.xpath("//*[@id='subListDiv']/table/tbody/tr[1]/td[2]/label")).getText());
//	System.out.println("Package Actuak Cost:"+properties.getProperty(driver.findElement(By.xpath("//*[@id='subListDiv']/table/tbody/tr[1]/td[2]/label")).getText()));
//	System.out.println("Package Amount to collect:"+properties1.getProperty(driver.findElement(By.xpath("//*[@id='subListDiv']/table/tbody/tr[1]/td[2]/label")).getText()));
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		driver.quit();
	}
} 
} 