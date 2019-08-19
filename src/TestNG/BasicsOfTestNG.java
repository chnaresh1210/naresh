package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsOfTestNG {

	
/*
setup to app
browser launch
enter url
login  page
google title open
logout from app
login  page
search page
logout from app
delete all cookies 
close browser 
PASSED: googleTitle
PASSED: searchpage
*/

	
	@BeforeSuite

	public void setup(){

		System.out.println("setup to app");
	}

	@BeforeTest

	public void launchBrowser(){

		System.out.println("browser launch");
	}

	@BeforeClass

	public void enterURl(){

		System.out.println("enter url");
	}

	@BeforeMethod

	public void login(){

		System.out.println("login page");
	}

	@Test

	public void googleTitle(){
		System.out.println("google title open");
	}

	@Test
	
	public void searchpage(){
		System.out.println("search page");
	}
	
	@AfterMethod

	public void logout(){
		System.out.println("logout from app");
	}

	@AfterClass

	public void deleteAllCookies(){
		System.out.println("delete all cookies ");
	}

	@AfterTest

	public void closeBrowser(){
		System.out.println("close browser ");
	}

	@AfterSuite

	public void genarateReports(){
		System.out.println("reports genarate");
	}



}
