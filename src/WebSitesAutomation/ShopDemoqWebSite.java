package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ShopDemoqWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		// Shopping 

		driver.get("http://shop.demoqa.com/");

		driver.findElement(By.xpath("//a[@class='noo-search']")).click();

		driver.findElement(By.name("s")).sendKeys("Tokyo Talkies");

		WebElement naresh = driver.findElement(By.name("s"));

		naresh.sendKeys((Keys.ENTER));

		driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();

		driver.findElement(By.xpath("//a[@class='button wc-forward']")).click();

		driver.findElement(By.xpath("//input[@id='noo_coupon_code']")).sendKeys("NARESH007");

		driver.findElement(By.xpath("//button[contains(@class,'noo-apply-coupon')]")).click();

		driver.findElement(By.xpath("//a[contains(@class,'checkout-button button alt wc-forward')]")).click();

		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("naresh");

		driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("choppara");

		driver.findElement(By.xpath("//input[@id='billing_company']")).sendKeys("google");

		driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();

		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");

		WebElement dd = driver.findElement(By.xpath("//input[@class='select2-search__field']"));

		dd.sendKeys((Keys.ENTER));



		driver.findElement(By.id("billing_address_1")).sendKeys("karumanchi post and village");

		driver.findElement(By.id("billing_address_2")).sendKeys("ongole andhra pradesh");

		driver.findElement(By.id("billing_city")).sendKeys("ongole");

		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();

		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Andhra Pradesh");

		WebElement dr = driver.findElement(By.xpath("//input[@class='select2-search__field']"));

		dr.sendKeys((Keys.ENTER));



		//		driver.findElement(By.xpath("//span[text()='Andhra Pradesh']")).click();

		driver.findElement(By.id("billing_postcode")).sendKeys("523272");

		driver.findElement(By.id("billing_phone")).sendKeys("9849108737");

		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("chnaresh1210@gmail.com");

		//		driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("packed good clothes");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		WebElement ch = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		ch.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='place_order']")).click();












	}

}
