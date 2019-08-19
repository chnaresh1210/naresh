package DeEnSemethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		maximize browser
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
          // 1.....isdisplayed 
		
		boolean naresh = driver.findElement(By.xpath("//a[text()='Create a Page']")).isDisplayed();
				
		System.out.println(naresh);		
				
		
		
		// 2...isEnabled
	
	   boolean choppara = driver.findElement(By.xpath("//a[text()='Cookies']")).isEnabled();
	   
	   System.out.println(choppara);
	
	  // 3...Selected it applicable to dropdown box,radio button,check box
	   
	   boolean test = driver.findElement(By.id("Male")).isSelected();
	   
	   System.out.println(test);
	   
	   
	}

}
