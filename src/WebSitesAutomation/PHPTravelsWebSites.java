package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravelsWebSites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		
	
		
		// PHP Travel Demo sites
	
		/*
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		
		driver.findElement(By.xpath("//div[@class='col-md-9']//div[@class='row']//a[@class='btn btn-primary btn-lg btn-block']")).click();
		
		driver.findElement(By.xpath("//small[text()='http://www.phptravels.net']")).click();
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("naresh");
		
		driver.findElement(By.name("lastname")).sendKeys("choppara");
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9849108737");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chnaresh1210@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("naresh007");
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("naresh007");
		
		driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("choppara");
		
		*/
		
		driver.get("https://www.phptravels.net/");
	 
		driver.findElement(By.xpath("//a[@title='Cars']")).click();
		
		driver.findElement(By.xpath("//div[@id='select2-drop']//input[@class='select2-input']")).click();

		driver.findElement(By.xpath("//div[@id='select2-drop']//input[@class='select2-input']")).sendKeys("Manchester");
		
		WebElement element = driver.findElement(By.xpath("//div[@id='select2-drop']//input[@class='select2-input']"));

		element.sendKeys((Keys.ENTER));
		
		/*
		
		driver.findElement(By.xpath("//div[@id='dpd1']//i[@class='iconspane-lg icon_set_1_icon-53']")).sendKeys("01/08/2019");
		
		driver.findElement(By.xpath("//div[@id='dpd2']//i[@class='iconspane-lg icon_set_1_icon-53']")).sendKeys("02/08/2019");
		
		driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();	
		
		driver.findElement(By.xpath("//button[@id='hadultPlusBtn']//i[@class='fa fa-plus']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
		
		driver.findElement(By.xpath("//i[@class='ico fa fa-lock']")).click();
		
		driver.findElement(By.xpath("//i[@class='ico fa fa-lock']")).click();
		
		*/
		
		
		
		
		
	}

}
