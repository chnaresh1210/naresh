package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//purpose the program below is to do :
//Author
//creayed date
//how many methods you have 
//how many variables you have used
// have you released all the used objects

//class NinjaStore is defined below
public class NinjaStore {

	//main method is defined here
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Setting Chrome browser path for selenium webdriver to version 76.
		//System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
	
		//define an object to WebDriver interface
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Ninja store for shoping

		/*

		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

		driver.findElement(By.name("firstname")).sendKeys("naresh");

		driver.findElement(By.name("lastname")).sendKeys("choppara");

		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.name("telephone")).sendKeys("9849108737");

		driver.findElement(By.name("password")).sendKeys("naresh007");

		driver.findElement(By.name("confirm")).sendKeys("naresh007");

		driver.findElement(By.name("agree")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		 */


/*
		

		// Store---- desktop

		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a"))).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'Show All Desktops')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Sony VAIO')]")).click();

		driver.findElement(By.id("button-cart")).click();

		// laptops and notebook
		driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'HP LP3065')]")).click();

		driver.findElement(By.id("button-cart")).click();


		// components

		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[3]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Show All Components')]")).click();

		driver.findElement(By.xpath("//*[@id='content']/div/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Samsung SyncMaster 941BW')]")).click();

		driver.findElement(By.id("button-cart")).click();


		// Tablets
		//		driver.findElement(By.xpath("//a[contains(text(),'Tablets')]")).click();

		//		driver.findElement(By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]")).click();
		//
		//		driver.findElement(By.id("button-cart")).click();

		//        driver.navigate().back();

		// Software
		
		driver.findElement(By.xpath("//a[contains(text(),'Software')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click(); // empty there is no items here so back to home


		// Phone and PDA's
		
		driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[6]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'HTC Touch HD')]")).click();

		driver.findElement(By.id("button-cart")).click();


		// Camares
		
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[7]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Canon EOS 5D')]")).click();

		driver.findElement(By.id("button-cart")).click();


		// MP3 Player

//		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

		driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[8]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Show All MP3 Players')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'iPod Classic')]")).click();

		driver.findElement(By.id("button-cart")).click();



		// checkout payment



		driver.findElement(By.xpath("//span[@id='cart-total']")).click();

		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();

		Thread.sleep(3000);




		// check out
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();


		// Login using user credientials 		

		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.name("password")).sendKeys("naresh007");

		driver.findElement(By.id("button-login")).click();

		// Billing Details

//		driver.findElement(By.name("firstname")).sendKeys("naresh");
//
//		driver.findElement(By.name("lastname")).sendKeys("choppara");
//
//		driver.findElement(By.name("company")).sendKeys("infosys");
//
//		driver.findElement(By.name("address_1")).sendKeys("ongole");
//
//		driver.findElement(By.name("address_2")).sendKeys("karimanchi");
//
//		driver.findElement(By.name("city")).sendKeys("ongole");
//
//		driver.findElement(By.name("postcode")).sendKeys("532001");
//
//		driver.findElement(By.name("postcode")).sendKeys("532001");
//
//		// using dropdown to select the country
//
//		Select dropdown = new Select(driver.findElement(By.name("country_id")));
//
//		dropdown.selectByVisibleText("India");
//
//		Select dropdown1 = new Select(driver.findElement(By.name("zone_id")));
//
//		dropdown1.selectByVisibleText("Andhra Pradesh");



		driver.findElement(By.xpath("//*[@id='button-payment-address']")).click();

		driver.findElement(By.xpath("//*[@id='button-shipping-address']")).click();

		driver.findElement(By.xpath("//*[@id='button-shipping-method']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();

		driver.findElement(By.xpath("//*[@id='button-payment-method']")).click();		

		driver.findElement(By.xpath("//*[@id='button-confirm']")).click();

		 


				Thread.sleep(5000);

		
		// Contact to Store dealars

		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

		driver.findElement(By.xpath("//ul[@class='list-inline']/li/a/i[@class='fa fa-phone']")).click();

//		driver.findElement(By.name("name")).sendKeys("naresh");

//		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.name("enquiry")).sendKeys("hi naresh choppara how are you");

		driver.findElement(By.xpath("//*[@type='submit']")).click();

   		driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();

*/
		// My Account

		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");

		
		
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();

		Actions action1 = new Actions(driver);

		action1.moveToElement(driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a"))).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		// login to my account        

		driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");

		driver.findElement(By.name("password")).sendKeys("naresh007");

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// Edit Account
		
		driver.findElement(By.xpath("//div[@id='content']/ul/li/a[contains(text(),'Edit Account')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
		
		// change password

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Password')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
		
		// Address Book
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Address Book')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
		
		// Wish List
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Wish List (%s)')]")).click();

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
		
		// My orders-----Order History
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Order History')]")).click();

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
 		
		// Downloads
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Downloads')]")).click();

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
		
		
		// Reward Points
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Reward Points')]")).click();
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
		
		
		// Return
		
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Returns')]")).click();

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
		
		
		// transcations
			
		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Transactions')]")).click();

		driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
		
        
		// Payment Profile

        driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Payment Profile')]")).click(); 

        driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Continue')]")).click();
        
        
        // My Affiliate Account
                
        driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Register for an affiliate account')]")).click(); 

        driver.navigate().back();
        
        
        // News Letters
        
        driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'Newsletter')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Back')]")).click();
        
        
        // Shopping Cart
        
        driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        
        
        // Check out
        
        driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        
        
        // Delivery Information
        
        driver.findElement(By.xpath("//a[contains(text(),'Delivery Information')]")).click();

        driver.navigate().back();
        
        
        // Privacy Policy
        
        driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();

        driver.navigate().back();

        // Terms and condition
        
        driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();

        driver.navigate().back();
        
        
    
        // Items Returns
        
        driver.findElement(By.xpath("//a[contains(text(),'Returns')]")).click();

        // Order History
        
        driver.findElement(By.name("firstname")).sendKeys("naresh");
        
        driver.findElement(By.name("lastname")).sendKeys("choppara");
        
        driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");
        
        driver.findElement(By.name("telephone")).sendKeys("9849108737");
        
        driver.findElement(By.name("order_id")).sendKeys("1234");
        
        driver.findElement(By.name("firstname")).sendKeys("naresh");
        
        driver.findElement(By.name("date_ordered")).sendKeys("2019-08-09");
        
        driver.findElement(By.name("product")).sendKeys("honor mobile");
        
        driver.findElement(By.name("model")).sendKeys("Honor6X");
        
        driver.findElement(By.name("quantity")).sendKeys("1");
        
        driver.findElement(By.xpath("//input[@value='2']")).click();
        
        driver.findElement(By.xpath("//*[@id='content']/form/fieldset[2]/div[5]/div/label[2]"));
        
        driver.findElement(By.name("comment")).sendKeys("worng item");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
                  
                   
        // Site Map
                        
        driver.findElement(By.xpath("//a[contains(text(),'Site Map')]")).click();

        driver.navigate().back();
        
        // Brands
        
        driver.findElement(By.xpath("//a[contains(text(),'Brands')]")).click();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Apple')]")).click();

        driver.navigate().back(); 
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),'Canon')]")).click();

        driver.navigate().back();
        
        
        // Gift Certificate
                
        driver.findElement(By.xpath("//a[contains(text(),'Gift Certificates')]")).click();

        driver.findElement(By.name("to_name")).sendKeys("naresh");
                
        driver.findElement(By.name("to_email")).sendKeys("choppara.naresh@gmail.com");
        
       // driver.findElement(By.name("from_name")).sendKeys("choppara");
        
     //   driver.findElement(By.name("from_email")).sendKeys("chnaresh1210@gmail.com");
        
        driver.findElement(By.xpath("//*[@id='content']/form/div[5]/div/div[1]/label")).click();
        
        driver.findElement(By.name("message")).sendKeys("hi naresh choppara");
        
        driver.findElement(By.name("amount")).sendKeys("2");
        
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        
        driver.findElement(By.xpath("//input[@value='Continue']")).click();



        
        
        
        
        
        
        
	}

}
