package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.youtube.com/");

		//take screenshot and store as a file format
		//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//		
		//		//now copy the file to desired location  using copy file
		//		
		//		FileUtils.copyFile(src, new File("E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab\\src\\screenshot\\selenium\\naresh1.png"));
		//		
//				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//		
//				FileUtils.copyFile(src, new File("E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab\\src\\screenshot\\selenium\\naresh2.png"));
		////		
		//		Date naresh = new Date();
		//		
		//        String sreenshot = "naresh"+naresh.toString().replace(" ", "_").replace(":", "_")+".png";
		//		
		//        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//        
		//        FileUtils.copyFile(source, new File("E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab\\src\\screenshot\\selenium\\"+sreenshot));
		//	
		Date naresh = new Date();

		String pradeep ="choppara"+naresh.toString().replace(" ", "_").replace(":", "_")+".png";

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("E:\\Work\\Suresh\\Selenium_WS\\WS\\Demo_SauceLab\\src\\screenshot\\selenium\\"+pradeep));
















	}

}
