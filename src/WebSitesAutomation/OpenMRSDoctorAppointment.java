package WebSitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenMRSDoctorAppointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Suresh\\Selenium_WS\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		
		
		// LogIn MRC page
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
		driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();
		
		driver.findElement(By.id("loginButton")).click();

//		driver.navigate().to("https://demo.openmrs.org/openmrs/referenceapplication/home.page");
//		
//				
//		driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
//		
//		
//		// create account
//		
//		driver.findElement(By.name("givenName")).sendKeys("naresh");
//		
//		driver.findElement(By.name("middleName")).sendKeys("kumar");
//		
//		driver.findElement(By.name("familyName")).sendKeys("choppara");
//	
////		driver.findElement(By.xpath("//label[text()='Unidentified Patient']")).click();
//		
//		driver.findElement(By.xpath("//span[text()='Gender']")).click();
//		
//		driver.findElement(By.xpath("//option[text()='Male']")).click();
//		
////		driver.findElement(By.xpath("//span[@id='birthdateLabel']")).click();
//		
//		driver.findElement(By.id("birthdateLabel")).click();
//		
//		driver.findElement(By.name("birthdateDay")).sendKeys("01");
////		
//		driver.findElement(By.name("birthdateMonth")).sendKeys("June");
//		
//		driver.findElement(By.name("birthdateYear")).sendKeys("1990");
//		
//		driver.findElement(By.xpath("//span[text()='Address']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("karumanchi post and village");
//		
//		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Andhra pradesh");
//		
//		driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys("karumanchi");
//		
//		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("ongole");
//		
//		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
//		
//		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("karumanchi");
//		
//		driver.findElement(By.xpath("//span[text()='Phone Number']")).click();
//		
//		driver.findElement(By.name("phoneNumber")).sendKeys("9849108737");
//		
//		driver.findElement(By.xpath("//span[text()='Relatives']")).click();
//		
//		WebElement element = driver.findElement(By.name("relationship_type"));
//		
//		Select naresh = new Select(element);
//		
//		naresh.selectByVisibleText("Patient");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Person Name']")).sendKeys("pradeep choppara");
//		
//		driver.findElement(By.xpath("//span[@id='confirmation_label']")).click();
//		
//		driver.navigate().back();
		
	
		
		// Get appointment slot available or not
		
//		driver.navigate().to("https://demo.openmrs.org/openmrs/index.htm");
//				
//		driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='patient-search']")).sendKeys("naresh kumar choppara");
//		
//		driver.findElement(By.xpath("//td[text()='100HYE']")).click();
//		
//		driver.findElement(By.xpath("//i[@class='icon-share-alt edit-action']")).click();
//		
////		driver.findElement(By.xpath("//div[@ng-show='showScheduleAppointment']//div[@id='searchParameters']//div[@id='selectAppointmentType']//input[@type='text']")).sendKeys("Dermatology");
//		
//        driver.findElement(By.xpath("//a[text()='View all types']")).click();	
//		
//		driver.findElement(By.xpath("//a[text()='Dermatology']")).click();
        
        
        //		WebElement element = driver.findElement(By.xpath("//input[@ng-model='appointmentType']"));
//		
//		Select naresh = new Select (element);
//		
//		naresh.selectByVisibleText("Dermatology");
//		
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu ng-not-empty ng-valid ng-valid-date ng-valid-date-disabled']//span[@class='btn-group pull-left']"));
//		
//		driver.findElement(By.xpath("//td[@id='datepicker-307-9770-1']//button[@class='btn btn-default btn-sm']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		
		
		
		// Admit in-patient in hospital
		
		
//		driver.findElement(By.xpath("//a[@id='referenceapplication-vitals-referenceapplication-vitals-extension']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='patient-search']")).sendKeys("naresh kumar choppara");
//		
//		driver.findElement(By.xpath("//tr[1]//td[2]")).click();
//		
//		driver.findElement(By.xpath("//i[@class='icon-arrow-right']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w8']")).sendKeys("172");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Weight (kg)')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w10']")).sendKeys("72");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'(Calculated) BMI')]")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Temperature (C)')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w12']")).sendKeys("40");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Pulse')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w14']")).sendKeys("72");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Respiratory rate')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w16']")).sendKeys("40");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Blood Pressure')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w18']")).sendKeys("120");
//		
//		driver.findElement(By.xpath("//input[@id='w20']")).sendKeys("80");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Blood oxygen saturation')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='w22']")).sendKeys("50");
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
//		
//		driver.findElement(By.xpath("//button[@class='submitButton confirm right focused']")).click();
//		
//		
		
		
		// Request to daily appointment
		
		driver.findElement(By.xpath("//a[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']")).click();
		
		driver.findElement(By.xpath("//a[@id='appointmentschedulingui-scheduledAppointments-app']//i[@class='icon-calendar']")).click();
						
		driver.findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-empty ng-touched']")).sendKeys("Scheduled");
		
		driver.findElement(By.xpath("//a[contains(text(),'View all types')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Dermatology (New Patient)')]")).click();
		
//		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
