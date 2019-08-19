import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG {

	
//	BeforeSuite.....setup webdriver
//	BeforeTest.....browser launch

//	BeforeMethod......enter url
//	Test....Get title
//	AfterMethod.....logout page

//	BeforeMethod......enter url
//	Test.....google title
//	AfterMethod.....logout page

//	BeforeMethod......enter url
//	Test....login successfully
//	AfterMethod.....logout page

//	BeforeMethod......enter url
//	Test.....search page
//	AfterMethod.....logout page

//	AfterClass.....delete all cookies
//	AfterTest.....close browser
	
	
	
	
	
	
	@BeforeSuite

	public void setup(){
		System.out.println("BeforeSuite.....setup webdriver");
	}

	@BeforeTest

	public void browserLaunch(){
		System.out.println("BeforeTest.....browser launch");
	}

	@BeforeClass

	public void loginPage()
	{
		System.out.println("BeforeClass.....login page");
	}

	@BeforeMethod

	public void enterUrl(){

		System.out.println("BeforeMethod......enter url");
	}

	@Test

	public void googleTitle(){
		System.out.println("Test.....google title");

	}

	@Test

	public void searchPage(){
		System.out.println("Test.....search page");
	}

	@Test
	public void login()
	{
		System.out.println("Test....login successfully");
	}
	
	@Test
	
	public void getTitle(){
		System.out.println("Test....Get title");
	}
	
		
	
	@AfterMethod

	public void logout(){
		System.out.println("AfterMethod.....logout page");
	}

	@AfterClass

	public void deleteAllCookies(){

		System.out.println("AfterClass.....delete all cookies");
	}

	@AfterTest

	public void closeBrowser(){
		System.out.println("AfterTest.....close browser");
	}

	@AfterSuite

	public void allTestReports(){
		System.out.println("AfterSuite....all reports");
	}

















}
