package DynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chrome _drivers\\chromedriver_v76.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
	
		String afterXpath = "]/td[1]";

		for(int i=2; i<=7; i++){

			String actualXpath = beforeXpath+i+afterXpath;

			WebElement element = driver.findElement(By.xpath(actualXpath));

			System.out.println(element.getText());

			if(element.getText().equals("Island trading")){

				System.out.println("company name :" +element.getText()+ " is found" + "at position :" + i);

				break;

			}
		}
//
		System.out.println("******");

		//*[@id="customers"]/tbody/tr[2]/td[2]

		String afterXpathcontact = "]/td[2]";

		for(int i=2; i<=7; i++){

			String actualXpath = beforeXpath+i+afterXpathcontact;

			WebElement element = driver.findElement(By.xpath(actualXpath));

			System.out.println(element.getText());

		}

		System.out.println("*****");


		String afterXpathcountry = "]/td[3]";

		for(int i=2; i<=7; i++){

			String actualXpath = beforeXpath+i+afterXpathcountry;

			WebElement element = driver.findElement(By.xpath(actualXpath));

			System.out.println(element.getText());








		}


		
	}

	}
