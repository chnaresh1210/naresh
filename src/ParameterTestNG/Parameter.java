package ParameterTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	WebDriver driver;


	@Test

	@Parameters ({"browser","url","emailId"})

	public void yahooLoginTest(String browser, String url, String emailId ){

        
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		if(browser.equals("GoogleChrome")){
		
		driver = new ChromeDriver();
           
		}
		
  		driver.manage().window().maximize();

//		driver.get(url);

  		driver.get("https://login.yahoo.com/");
  		
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();

		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("choppara.naresh@yahoo.com");

		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

 









	}
}
