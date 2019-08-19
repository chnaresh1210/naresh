package BasicofJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllContant {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

//		List<WebElement> objLinks = driver.findElements(By.tagName("a"));
//
//		for(WebElement objcurrentLinks : objLinks){
//
//			String strLinkText = objcurrentLinks.getText();
//
//			System.out.println(strLinkText);


		 List<WebElement> naresh = driver.findElements(By.tagName("a"));
		 
		 for(WebElement choppara : naresh){
			 
			 String suresh = choppara.getText();
			 
			 System.out.println(suresh);
			
			
			


		}













	}
}
