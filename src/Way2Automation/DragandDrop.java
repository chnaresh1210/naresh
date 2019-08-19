package Way2Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();


		// Wat2Automation open
		driver.get("http://way2automation.com/way2auto_jquery/droppable.php");

		//driver.findElement(By.xpath("//h2[contains(text(),'Draggable')]")).click();

		

			Set<String> naresh = driver.getWindowHandles();

			Iterator<String> choppara = naresh.iterator();

			String homepage = choppara.next();

			String popuppage = choppara.next();

			driver.switchTo().window(popuppage);

			driver.close();
			
//			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
//			
//			driver.findElement(By.name("username")).sendKeys("naresh");
//					
//			driver.findElement(By.name("password")).sendKeys("naresh007");
//			
//			driver.findElement(By.className("button")).click();
//			
			driver.switchTo().window(homepage);

			// create new page

			/*
			
			driver.findElement(By.xpath("//h2[contains(text(),'Draggable')]")).click();

			driver.findElement(By.name("name")).sendKeys("naresh");

			driver.findElement(By.name("phone")).sendKeys("9849108737");

			driver.findElement(By.name("email")).sendKeys("chnaresh1210@gmail.com");

			driver.findElement(By.name("addr")).sendKeys("ongole");

			driver.findElement(By.name("username")).sendKeys("naresh");

			driver.findElement(By.name("password")).sendKeys("naresh007");

	        driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']")).click();

		 */

		// drag and drop

		driver.findElement(By.id("draggable")).click();

		WebElement drag = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']//p[contains(text(),'Drop here')]"));
		
		driver.switchTo().frame(0);

		Alert alert = driver.switchTo().alert();

           	









	}

}


