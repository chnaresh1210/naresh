package Guru99DemoSites;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Guru99 Dynamic table
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
//		// table columns
//		
//		WebElement col =   driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
//
//		System.out.println("no fo columns:" + col.getSize());
//		
//		// table rows
//		
//     	WebElement row =  driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//	
//	    System.out.println("no fo rows:" + row.getSize());
	
	
		WebElement ch = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[11]"));
		
		System.out.println(ch.getText());
		
		System.out.println(ch.getTagName());
		
		
	
	
	
	}
}
