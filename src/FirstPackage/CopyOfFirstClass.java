
package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new FirefoxDriver();
		System. setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
		
		//Create webdriver Interface object and assign it to Chrome driver
		WebDriver driver = new ChromeDriver();	
		
		//create object to TC1 Java class
		
		TestCase_1 tc1 = new TestCase_1();
		//call a function in Class named TestCase_1.java
		//call openQAURL user defined function via class object tc1 using dot . 
		//provide  two parameters 1. WebDriver object, 2.URL String
		String url = "https://www.toolsqa.com/automation-practice-form/";
		tc1.openQAURL(driver,url);
		
		
		
//		driver.get		("https://www.toolsqa.com/automation-practice-form/");
//		System.out.println("Title of the page is ::"+driver.getTitle());
//		
		WebElement firstname = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		firstname.click();
		CharSequence[] fn= {"N","A","R","E","S","H"};
		firstname.sendKeys(fn);
		WebElement lastname = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		lastname.click();
		CharSequence[] ln= {"KMC","AP"};
		lastname.sendKeys(ln);
		
		WebElement linkt = driver.findElement(By.linkText("Partial Link Test"));
		linkt. click(); 
		
		String rbtn_gender_m = "//input[@id='sex-0']"; 
		WebElement gender = driver.findElement(By.xpath(rbtn_gender_m));
	    gender.click();
	    
		
	}

}
