package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Listener implements ITestListener{

	WebDriver driver;
	
	@BeforeTest
	
	public void launchBrowser(){
		

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");
		
	    driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
	
	
	}

@Test

public void youtubePage(){
	
	driver.get("https://www.youtube.com/");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);


}

@Test

public void facebookPage(){
	
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	
	System.out.println(title);
}

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}







}
