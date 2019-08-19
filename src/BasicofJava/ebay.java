package BasicofJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
 
     driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("naresh");
	    
     driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("choppara");
	    
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("choppara.naresh@gmail.com");
	    
	 driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("naresh007");
 
 
 
 
 
 
 
 
 
 
 }
}
