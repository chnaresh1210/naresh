package InterviewQandA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandelWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']")).click();
	
		
		Thread.sleep(3000);
		
	    
		Set<String> handler = driver.getWindowHandles();
	 
		
	    Iterator<String> it = handler.iterator();
	    
	   
	    String parentwindowId =  it.next();
	    System.out.println("parent window id: "+ parentwindowId);
	    
        
	    String childwindowId =  it.next();
	    System.out.println("parent window id: "+ childwindowId);
	    
	    
	    driver.switchTo().window("childwindowId");
	    
	    Thread.sleep(3000);
	    
	    
	    System.out.println("child window popup title"+driver.getTitle());
	    
	    driver.close();
	    
	    
	    
        driver.switchTo().window("parentwindowId");
	    
        
        Thread.sleep(3000);
        
	    System.out.println("child window popup title"+driver.getTitle());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	
	
	
	
	
	
	
	
	
	}

}
