package AlertExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumeasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//		maximize browser
		driver.manage().window().maximize();
		//		launch browser
		driver.get("https://www.google.com/");
		//		navigate browser into the google page
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		////	   open input form dropdown menu
		//	    driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
		////	    select first link (SIMPLE FORM DEMO)
		//	    driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]")).click();
		////	    after open first link give some message
		//	    driver.findElement(By.xpath("//div[@class='form-group']//input[@id='user-message']")).sendKeys("hi hello world");
		////	    display the user text message
		//	    driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();                                     //first dropdown list
		////	    enter value of a is 100
		//	    driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("100");
		////	    enter value of a is 200
		//	    driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("200");
		////	    add total A and B value is 300
		//	    driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		//	



		//		//		open data pickers dropdown list
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Date pickers')]")).click();
		//		//      select first link of bootstrap data picker	
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap Date Picker')]")).click();
		//		//		     	select date of bootstrap
		//		driver.findElement(By.xpath("//div[@class='input-group date']//input[@class='form-control']")).sendKeys("03/07/2019");          //second dropdown list
		//
		//		//      select calendar of bootstrap and open calendar
		//		//		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='today'][contains(text(),'Today')]")).click();
		//		// 
		//		Thread.sleep(5000);
		//		//	    clear the current date
		//		//		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='clear'][contains(text(),'Clear')]")).click();
		//
		//		// enter the start date of calendar
		//		driver.findElement(By.xpath("//input[@placeholder='Start date']")).sendKeys("01/02/2018");
		//		// enter the end date of calendar
		//		driver.findElement(By.xpath("//input[@placeholder='End date']")).sendKeys("18/02/2019");

		//
		////    select date picker drop dwon list
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Date pickers')]")).click();
		////		select the second link of JQuery date picker
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Date Picker')]")).click();
		////     starting date
		//		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("01/06/2019");                                             //second list second link
		////		ending date
		//		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("10/06/2019");


		//		select date picker drop dwon list
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();
		//////		select the second link of JQuery date picker
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Table Pagination')]")).click();
		//////    
		//		
		////		driver.findElement(By.xpath("//tbody[@id='myTable']//td[contains(text(),'Table cell']")).click();       //third table dropdown completed
		//	
		//	driver.findElement(By.xpath("//a[@class='page_link']")).click();	
		//		
		//	Thread.sleep(5000);	
		//		
		//		driver.findElement(By.xpath("//a[@class='next_link']")).click();
		//		
		//		driver.findElement(By.xpath("//a[@class='prev_link']")).click();
		//				


		//		
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Progress Bar')]")).click();
		//		
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Download Progress bars')]")).click();    //right side dropdown box list
		//		
		//		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		//		
		//		

		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Progress Bar')]")).click();
		//		
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap Progress bar')]")).click();          //right side second link
		//		
		//	    driver.findElement(By.xpath("//i[@class='fa fa-fw fa-download']")).click();
		//	

		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Progress Bar')]")).click();
		//		
		//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Drag & Drop Sliders')]")).click(); 
		//		
		//		driver.findElement(By.xpath("//div[@class='range']//input[@name='range']")).sendKeys("20");
		//	
		//	

		//	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Form')]")).click();
		//	
		//	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]")).click();
		//	
		//	driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		//	
		//	driver.findElement(By.xpath("//input[@type='button']")).click();

		//	Thread.sleep(5000);

		//	driver.findElement(By.xpath("//input[@type='button']")).click();

		//	driver.findElement(By.xpath("//label[text()='Option 3']")).click();

		//	Thread.sleep(5000);

		//	driver.findElement(By.xpath("//label[text()='Option 2']")).clear();

		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Form')]")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")).click();
        
//        driver.findElement(By.xpath("//label[1]")).click();
       
//        driver.findElement(By.xpath("//div[@class='panel-body']//label[2]")).click();
//
//        driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();

//        driver.findElement(By.xpath("//div[@class='panel-body']//div//label[contains(text(),'Male')]")).click();
//        
//        driver.findElement(By.xpath("//input[@value='15 - 50']")).click();
//        
//        driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();
	
	
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
//        select.selectByVisibleText("Sunday");
//        
//        driver.findElement(By.xpath("//button[@id='printAll']")).click();
	
//        driver.findElement(By.xpath("//option[@value='California']")).click();
	
//        driver.findElement(By.xpath("//option[@value='Florida']")).click();
//        
//        driver.findElement(By.xpath("//option[@value='New Jersey']")).click();
//	
//        driver.findElement(By.xpath("//option[@value='New York']")).click();
//        
//        driver.findElement(By.xpath("//button[@id='printMe']")).click();
        
//	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("naresh");
//	
//	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("choppara");
//	
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chnaresh1210@gmail.com");
//	
//	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9849108737");
//	
//	driver.findElement(By.xpath("//input[@name='address']")).sendKeys("karumanchi post and village");
//		
//	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("karumanchi");
//	
//	Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='state']")));
//	dropdown.selectByVisibleText("Indiana");
//	
//	driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("523272");
//	
//	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("Google");
//	
//	driver.findElement(By.xpath("//input[@value='yes']")).click();
//	
//	driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("selenium automation testing");
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//	driver.findElement(By.xpath("//input[@name='title']")).sendKeys("naresh choppara");
//	
//	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("hi this is naresh choppara ,i am coming from ongole");
//	
//	driver.findElement(By.xpath("//input[@id='btn-submit']")).click();
//	
	
    Select dropdown = new Select(driver.findElement(By.xpath("//span[@dir='ltr']//span[1]")));
        
        dropdown.selectByVisibleText("India");
	
	
	
	
	}


}
