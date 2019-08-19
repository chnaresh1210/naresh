package InterviewQandA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertandPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	    driver.findElement(By.name("proceed")).click();
	
	    Thread.sleep(5000);
//	    
//	    Alert alert = driver.switchTo().alert();
//	    
//	    System.out.println(alert.getText());
//	    
//	    alert.accept();
//	
//	
	
	Alert alert  = driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	String text = alert.getText();
	
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("alert passed");
	}
	else
	{
		System.out.println("alert  failed"); 
	}
	
	alert.accept();
	
	
	
	}

}
	