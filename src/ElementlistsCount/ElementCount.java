package ElementlistsCount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.com/amzon/s?k=amzon");
		
		List<WebElement> naresh = driver.findElements(By.tagName("a"));
	
	    System.out.println(naresh.size()); //get count all the links in amazon page
	    
//	    List<WebElement> naresh1 = driver.findElements(By.tagName("input"));
//	    
//	    System.out.println(naresh1.size()); //get count all the input links in amazon page
//	
//      List<WebElement> naresh2 = driver.findElements(By.tagName("button"));
//	    
//	    System.out.println(naresh2.size()); //get count all the input links in amazon page
	
	   for(int i=0;i<naresh.size();i++){
		   
		   String links = naresh.get(i).getText();
		   
		   System.out.println(links);
	   }
	    
	    
	    
	    
	}

}
