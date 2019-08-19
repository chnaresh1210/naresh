package WebSitesAutomation;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoSite {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		// Open blaze demo site using to book flight tikets
		
		driver.get("http://blazedemo.com/index.php");

		Select from = new Select(driver.findElement(By.name("fromPort")));

		from.selectByVisibleText("Mexico City");

		Select to = new Select(driver.findElement(By.name("toPort")));

		to.selectByVisibleText("Berlin");

		takesScreenshot("flight_search4");		
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

		takesScreenshot("flight_result5");




        // Select flight list

		driver.findElement(By.xpath("//table[@class='table']/tbody/tr[5]/td/input")).click();		
				
		driver.findElement(By.name("inputName")).sendKeys("naresh");

		driver.findElement(By.name("address")).sendKeys("ongole");

		driver.findElement(By.name("city")).sendKeys("ongole");

		driver.findElement(By.name("state")).sendKeys("Andhra pradesh");

		driver.findElement(By.name("zipCode")).sendKeys("532001");

		driver.findElement(By.name("cardType")).sendKeys("Visa");

		driver.findElement(By.name("creditCardNumber")).sendKeys("1234567890123456");

		driver.findElement(By.name("creditCardMonth")).sendKeys("08");

		driver.findElement(By.name("creditCardYear")).sendKeys("2019");

		driver.findElement(By.name("nameOnCard")).sendKeys("James Bond");

		driver.findElement(By.name("rememberMe")).click();

		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

	    takesScreenshot("flight_ticket6");
		
	}


	public static void takesScreenshot(String filename) throws IOException{

		Date naresh = new Date();
		
		String choppara = "pradeep"+naresh.toString().replace("", "").replace(":", "_")+".jpg";
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab" +"\\BTECH\\xyz" +filename+".jpg" +choppara));

		
		
	}








	}


