package Guru99DemoSites;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		// Open Guru99 Page

		driver.get("http://demo.guru99.com/test/upload/");

		// File Upload
		
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		
	    Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\padmamannam.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
