package ACTcableUserData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUserSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://partnerportal.actcorp.in/login");

		// Login Act Cable site

		driver.findElement(By.name("userName")).sendKeys("kalyan010582@gmail.com");

		driver.findElement(By.name("passCode")).sendKeys("110711");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// click on the package management

		driver.findElement(By.xpath("//h1[text()=' Package Management']")).click();

		//		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("12674784");


		File file = new File("C:\\Users\\suresh\\Desktop\\UserDataFull.txt");

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String subcribers; 
		while (( subcribers = br.readLine()) != null) {

			System.out.println("Search subcriber list:"+ subcribers);

			driver.findElement(By.xpath("//input[@id='searchBox']")).clear();

			driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(subcribers);

			System.out.println("subcriber list checked completely:" + subcribers);
		}





	}

}
