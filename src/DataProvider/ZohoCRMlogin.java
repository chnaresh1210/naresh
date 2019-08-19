package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCRMlogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		File f = new File("C:\\Users\\suresh\\Desktop\\EbayLogInAccount.xlsx");

		FileInputStream fin = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fin);

		XSSFSheet s = w.getSheetAt(0);

		int rowcount = s.getLastRowNum()+1;

		for(int i=1; i<=rowcount; i++){

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().deleteAllCookies();
			
			driver.get("https://www.facebook.com/");
			
			String email = s.getRow(i).getCell(0).getStringCellValue();
			
			String password = s.getRow(i).getCell(1).getStringCellValue();

		
			driver.findElement(By.id("email")).sendKeys("choppara.naresh@gmail.com");
			
			driver.findElement(By.id("pass")).sendKeys("kmc007");
			
			WebElement  naresh = driver.findElement(By.xpath("//input[@value='Log In']"));
			
			naresh.click();
			
			Thread.sleep(2000);
			
			naresh.sendKeys(Keys.ESCAPE);
	
			
			
			
	}

	}
}
