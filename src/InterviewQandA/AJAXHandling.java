package InterviewQandA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AJAXHandling {


	public String URL = "http://demo.guru99.com/test/ajax.html";

	WebDriver driver;

	WebDriverWait wait;

	@BeforeClass

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		//create chrome instance

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);

	}


	/*
	
	@Test

	public void AjaxCall() throws InterruptedException{

		driver.findElement(By.id("yes")).click();

		Thread.sleep(2000);

		WebElement yes = driver.findElement(By.id("buttoncheck"));
		
		yes.click();

		String text = yes.getText();
		
		System.out.println(text);
		
		// reset 
		WebElement no = driver.findElement(By.xpath("//input[@type='reset']"));
		
		no.click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("no")).click();

		Thread.sleep(2000);

		WebElement ch = driver.findElement(By.id("buttoncheck"));

		ch.click();
		
		String text1 = ch.getText();
		
		System.out.println(text1);   


  */





	


		@Test
	
		public void test_AjaxExample() {
	
			By container = By.cssSelector(".container");
	
			wait = new WebDriverWait(driver, 5);
	
			wait.until(ExpectedConditions.presenceOfElementLocated(container));
	
			
			
			//Get the text before performing an ajax call
	
			WebElement noTextElement = driver.findElement(By.className("radiobutton"));
	
			String textBefore = noTextElement.getText().trim();
	
			
			
			//Click on the radio button
			driver.findElement(By.id("yes")).click();
	
			
			
			//Click on Check Button
			driver.findElement(By.id("buttoncheck")).click();
	
			
			
			/*Get the text after ajax call*/
	
			WebElement TextElement = driver.findElement(By.className("radiobutton"));
	
			wait.until(ExpectedConditions.visibilityOf(TextElement));
	
			String textAfter = TextElement.getText().trim();
	
			
			
			/*Verify both texts before ajax call and after ajax call text.*/
	
			Assert.assertNotEquals(textBefore, textAfter);
	
			System.out.println("Ajax Call Performed");
	
			String expectedText = "Radio button is checked and it's value is Yes";
	
			
			
			/*Verify expected text with text updated after ajax call*/
	
			Assert.assertEquals(textAfter, expectedText);
	
			driver.close();
	}
	
	
	
	   
	   
		@AfterClass
	
		public void teardown(){
	
			driver.quit();
		}




}





