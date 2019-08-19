package WebSitesAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolsQADemoSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// getting googlechrome driver class  
		WebDriver driver = new ChromeDriver();

		//window maximize
		driver.manage().window().maximize();

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//delete all cookies
		driver.manage().deleteAllCookies();

		//launch browser
		//		driver.get("https://demoqa.com/tabs/");

		//select DEMO SITES menu items
		//		driver.findElement(By.xpath("//nav[@class='navigation']//span[text()='DEMO SITES']")).click();

		// click first link in demo sites
		//		driver.findElement(By.xpath("//nav[@class='navigation']//span[text()='Basic Demo Site']")).click();

		// 1.Sort
		//		driver.findElement(By.xpath("//ul[@id='sortable']")).click();

		//		Thread.sleep(3000);

		//		driver.findElement(By.xpath("//li[text()='Item 7']")).click();
		//		
		//		Actions action = new Actions(driver);
		//		
		//		Thread.sleep(3000);
		//		
		//		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		////		

		// 2.Select
		//		driver.findElement(By.xpath("//a[text()='Selectable']")).click();

		// select first link 
		//		driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']")).click();



		//		action.moveToElement(driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"))).build().perform();
		//


		//		//keyboard event sample form
		//		driver.findElement(By.id("userName")).sendKeys("naresh choppara");
		//		
		//		driver.findElement(By.id("currentAddress")).sendKeys("naresh choppara , karumanchi post and village , tangutur mandal , prakasam dt");
		//		
		//		driver.findElement(By.id("permanentAddress")).sendKeys("karumanchi");
		//		
		//		driver.findElement(By.id("submit")).click();
		//	

		// Right click

		//		Actions action = new Actions(driver);

		//		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		//	
		//	    action.contextClick(rightclick).build().perform();

		//	    WebElement copy = driver.findElement(By.xpath("//div[text()='Copy Me']"));

		//	    String text = copy.getText();
		//	    
		//	    System.out.println(text);

		//	    copy.click();

		//	    WebElement copy = driver.findElement(By.xpath("//*[@id='rightclickItem']/div[2]"));
		//	 
		//	    String text = copy.getText();
		//	    
		//	    System.out.println(text);
		//	
		//	    Thread.sleep(3000);

		//	    copy.click();

		//	double click

		//		Actions action = new Actions(driver);
		//		
		//	    action.clickAndHold(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).doubleClick().perform();
		//	

		// Tooltip

		//		driver.findElement(By.id("age")).sendKeys("29");


		// tabs

		//      driver.findElement(By.id("ui-id-1")).click();
		//      
		//      String url = driver.getCurrentUrl();
		//      
		//      System.out.println(url);
		//      
		//      Thread.sleep(3000);
		//	
		//      driver.findElement(By.id("ui-id-2")).click();
		//	
		//      String title = driver.getTitle();
		//      
		//      System.out.println(title);
		//      
		//      Thread.sleep(3000);
		//      
		//      driver.findElement(By.id("ui-id-3")).click();
		//	
		//	  String naresh = driver.getPageSource();
		//	  
		//	  System.out.println(naresh);
		//	

		// Select menu

		//		driver.get("https://demoqa.com/selectmenu/");
		//		
		//		Select dropdown = new Select(driver.findElement(By.xpath("//span[text()='Please pick one']")));
		//
		//		dropdown.selectByVisibleText("3");

		//		dropdown.selectByIndex(2);

		//		Thread.sleep(2000);

		//		dropdown.selectByVisibleText("Medium");


		// Menu

		//		driver.get("https://demoqa.com/menu/");
		//		
		//		Actions action = new Actions(driver);
		//		  
		//		action.moveToElement(driver.findElement(By.id("ui-id-9"))).build().perform();
		//	
		//	    Thread.sleep(2000);
		//	
		//	    driver.findElement(By.id("ui-id-13")).click();
		//	    
		//	    Thread.sleep(2000);
		//	
		//	    driver.findElement(By.id("ui-id-15")).click();

		//	dialog
		//		
		//		driver.get("https://demoqa.com/dialog/");
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
		//	

		// date picker

		//		driver.get("https://demoqa.com/datepicker/");
		//		
		//		driver.findElement(By.id("datepicker")).sendKeys("07/25/2019");

		// Control group

		//		driver.get("https://demoqa.com/controlgroup/");
		//
		//		Select dd = new Select(driver.findElement(By.xpath("//span[@id='car-type-button']//span[@class='ui-selectmenu-text'][contains(text(),'Compact car')]")));
		//
		//		Thread.sleep(2000);
		//		
		////		dd.selectByVisibleText("SUV");
		//
		//		dd.selectByValue("2");

		// Radio button
		//		
		//		driver.get("https://demoqa.com/checkboxradio/");
		//		
		//		driver.findElement(By.xpath("//label[text()='New York']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[text()='Paris']")).click();
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[text()='London']")).click();
		//	
		//	//CheckBox
		//		
		//		driver.findElement(By.xpath("//label[text()='2 Star']")).click();
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[text()='3 Star']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[text()='4 Star']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[text()='5 Star']")).click();
		//	
		//		
		////		check box nested label
		//		
		//		
		//		driver.findElement(By.xpath("//label[contains(text(),'2 Double')]")).click();
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[contains(text(),'2 Queen')]")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[contains(text(),'1 Queen')]")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//label[contains(text(),'1 King')]")).click();


		//	Button
		//		
		//		driver.get("https://demoqa.com/button/#");
		//		
		//		driver.findElement(By.xpath("//div[@class='widget']//input")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//div[@class='widget']//button")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//div[@class='widget']//a")).click();
		//	
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']")).click();
		//	
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-corner-all']")).click();
		//		
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//a[@class='ui-button ui-widget ui-corner-all']")).click();
		//	


		// tags

		//	driver.get("https://demoqa.com/autocomplete/");
		//	
		//	driver.findElement(By.id("tags")).sendKeys("java");
		//	

		//	Accrodion

		//		driver.get("https://demoqa.com/accordion/");
		//		
		//		driver.findElement(By.id("ui-id-3")).click();
		//	
		//		driver.findElement(By.id("ui-id-4")).click();
		//		
		//		driver.findElement(By.id("ui-id-5")).click();



		//		Practice Automation Form


		//		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//
		//		driver.findElement(By.name("firstname")).sendKeys("naresh");
		//
		//		driver.findElement(By.name("lastname")).sendKeys("choppara");
		//
		//		driver.findElement(By.id("sex-0")).click();
		//
		//		try{
		//
		//
		//			driver.findElement(By.id("exp-1")).click();
		//		}
		//		catch (ElementClickInterceptedException naresh)
		//		{
		//			System.out.println("error in clickable");
		//		}
		//		driver.findElement(By.id("datepicker")).sendKeys("7/25/2019");
		//
		//		driver.findElement(By.name("profession")).click();
		//
		//		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\suresh\\Desktop\\zen\\[iSongs.info] 01 -  Choolenge Aasma.mp3");
		//
		//		//        driver.findElement(By.xpath("//a[text()='Selenium Automation Hybrid Framework']")).click();
		//
		//		//        driver.findElement(By.xpath("//a[text()='Test File to Download']")).click();
		//
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.id("tool-2")).click();
		//
		//		Select dropdown = new Select(driver.findElement(By.name("continents")));
		//
		//		dropdown.selectByVisibleText("Europe");
		//
		////		dropdown.selectByIndex(2);
		//		
		//		Thread.sleep(2000);
		//
		//		driver.findElement(By.xpath("//option[text()='WebElement Commands']")).click();
		//
		//		Thread.sleep(3000);
		//
		//		driver.findElement(By.name("submit"));

		//  Automation Practice Switch Windows 

//		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
//
//		driver.findElement(By.id("button1")).click();
//
//		Set<String> naresh = driver.getWindowHandles();
//
//		Iterator<String> it = naresh.iterator();
//
//		String parentwindowId =  it.next();
//
//		System.out.println("parent window id: "+ parentwindowId);
//
//
//		String childwindowId =  it.next();
//		System.out.println("parent window id: "+ childwindowId);
//
//
//		driver.switchTo().window("childwindowId");
//
//		Thread.sleep(3000);
//
//
//		System.out.println("child window popup title"+driver.getTitle());
//
//		driver.close();
//
//
//
//		driver.switchTo().window("parentwindowId");
//
//
//		Thread.sleep(3000);
//
//		System.out.println("child window popup title"+driver.getTitle());
//
//
//		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		
	// Alert
		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Alert alert  = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		Thread.sleep(3000);
		
		alert.accept();
		
		
		





	}



}
