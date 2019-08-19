package CalenderTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoad {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.filemail.com/");
		
		driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("chnaresh1210@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='FilemailFrom']")).sendKeys("choppara.naresh@gmail.com	");
		
		driver.findElement(By.xpath("//*[@id='FilemailSubject']")).sendKeys("hi naresh");
		
		driver.findElement(By.xpath("//*[@id='FilemailMessage']")).sendKeys("hi naresh hhhh");
	
		driver.findElement(By.xpath("//*[@id='addBtn']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\suresh\\Desktop\\file_upload.exe");
		
		

		
		
//		Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		String str =alert.getText();
//		
//		System.out.println(str);
//		
//		Thread.sleep(3000);
//		
//		alert.accept();
//		
//		driver.findElement(By.xpath("//label[text()='Onward Date']")).sendKeys("10/07/2019");
////		String date = "10-July-2019";
//		String datearr []=date.split("-");
//		String day =datearr[0];
//		String month = datearr[1];
//		String year =datearr[2];
//		
//		driver.findElement(By.xpath("//input[@id='onward_cal']")).sendKeys("10/07/2019");

		
		
		
		
		
		
		//		driver.findElement(By.xpath("//span[@class='rbc-toolbar-label']")).sendKeys("July 2019");
//		driver.findElement(By.xpath("//div[@class='rbc-date-cell rbc-now rbc-current']")).sendKeys("13");
		
		
		
	}

}
