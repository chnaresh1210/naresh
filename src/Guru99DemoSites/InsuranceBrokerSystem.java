package Guru99DemoSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsuranceBrokerSystem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		// Open Guru99 Demo Site

		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		// Login Insurance Page

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("naresh007");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		
        // Request  Quotation for new Insurance Claim
		driver.findElement(By.xpath("//a[contains(text(),'Request Quotation')]")).click();
		
		// BreakDownCoverage for insurance claim
		driver.findElement(By.xpath("//option[contains(text(),'Roadside')]")).click();
		
		// wind Screen repair
		driver.findElement(By.xpath("//label[contains(text(),'YES')]")).click();
		
		// incidents
		driver.findElement(By.xpath("//input[@name='incidents']")).sendKeys("RoadSide Accident");	
		
		// Vehicle Registration number
		driver.findElement(By.xpath("//input[@name='registration']")).sendKeys("AP27AQ1234");
		
		// Annual Mileage
		driver.findElement(By.xpath("//input[@name='mileage']")).sendKeys("500");
		
		// Estimated value
		driver.findElement(By.xpath("//input[@name='value']")).sendKeys("40000");

		// Parking place
		driver.findElement(By.xpath("//option[contains(text(),'Street/Road')]")).click();
		
		// Start Policy----year
		driver.findElement(By.xpath("//option[contains(text(),'2018')]")).click();
		
		// Start Policy----month
		driver.findElement(By.xpath("//select[@id='quotation_vehicle_attributes_policystart_2i']//option[contains(text(),'January')]")).click();
		
		// Start Policy----date
		driver.findElement(By.xpath("//h5//select[@id='quotation_vehicle_attributes_policystart_3i']//option[contains(text(),'11')]")).click();
		
		// Calculate Premium
		driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
		
		Thread.sleep(2000);
		
		// Save Quotation
		driver.findElement(By.xpath("//input[@value='Save Quotation']")).click();
		
		
		
		
		
		
		
		
		
		
		/*

		// Register the Insurance 

		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();


		// Sign Up as a New User  

		// first name

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naresh ");

		//last name

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("choppara");

		// year		
		driver.findElement(By.xpath("//option[contains(text(),'1990')]")).click();

		// month
		driver.findElement(By.xpath("//option[contains(text(),'June')]")).click();

		//date
		driver.findElement(By.xpath("//select[@name='date']//option[contains(text(),'11')]")).click();

		// Full Insurance		
		driver.findElement(By.xpath("//label[contains(text(),'Full')]")).click();

		// Insurance Period
		driver.findElement(By.xpath("//select[@name='licenceperiod']")).sendKeys("20");

		// Occupation
		driver.findElement(By.xpath("//option[contains(text(),'Student')]")).click();

		// Address
		driver.findElement(By.xpath("//input[@name='street']")).sendKeys("ongole");

		// city
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("ongole");

		// country
		driver.findElement(By.xpath("//input[@name='county']")).sendKeys("india");

		// Postal code
		driver.findElement(By.xpath("//input[@name='post_code']")).sendKeys("523001");

		// email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chnaresh1210@gmail.com");

		// password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("naresh007");

		// confirm password
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("naresh007");

		Thread.sleep(2000);

		// submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		 */























	}

}
