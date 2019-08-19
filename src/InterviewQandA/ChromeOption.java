package InterviewQandA;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

//		WebDriver driver = new ChromeDriver();
			
//		driver.manage().window().maximize();

//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.manage().deleteAllCookies();

		
		ChromeOptions options = new ChromeOptions();
	
		// add extension o addblock ads
		
//		options.addExtensions(new File("C:\\Users\\suresh\\Downloads\\extension_3_51_1_0.crx"));
		
		// add arguments on incognito
		
//		options.addArguments("incognito");
		
		//  headless browser run on background run
		
//		options.addArguments("headless");

		// disalbe popup-blocking
		
//		options.addArguments("disable-popup-blocking");
		
        // chrome version 
		
		options.addArguments("versions");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		options.merge(capabilities);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.bankersadda.com/");
		
		String title = driver.getTitle();
		
		System.out.println("page title:" + driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.quit();

	}

}
