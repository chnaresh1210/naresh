package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMfromExcel {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome_drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		File f = new File("C:\\Users\\suresh\\Desktop\\CRM Create Account.xlsx");

		FileInputStream fin = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fin);

		XSSFSheet s = w.getSheetAt(0);

		int rowcount = s.getLastRowNum()+9;

		for(int i=0; i<=rowcount; i++){

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().deleteAllCookies();

			driver.get("https://www.zoho.in/crm/lp/crm-software.html?network=g&device=c&keyword=%2Bcrm%20%2Bwebsite&campaignid=2081105189&creative=374625606607&matchtype=b&adposition=1t1&placement=&adgroup=79333067689&gclid=CjwKCAjw1f_pBRAEEiwApp0JKACFwb6V3PwMyI0Q4Qgx_JYg5B_LK9sGiW4zqZZL9jqEY1_AwkfdsxoCIOkQAvD_BwE");
			

			String fullname = s.getRow(i).getCell(0).getStringCellValue();

			String email = s.getRow(i).getCell(1).getStringCellValue();
			
			String password = s.getRow(i).getCell(2).getStringCellValue();
			
			String  phone = s.getRow(i).getCell(3).getStringCellValue();
			
			driver.findElement(By.name("firstname")).sendKeys(fullname);
			
			driver.findElement(By.name("email")).sendKeys(email);
			
			driver.findElement(By.name("password")).sendKeys(password);
			
			driver.findElement(By.name("r_address/1.phone")).sendKeys(phone);
			
			
			
		}














	}
}
