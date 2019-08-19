package TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test

	public void logInPage(){
		System.out.println("page login");
	}

	
	@Test (dependsOnMethods = "logInPage")

	public void searchPage(){
		System.out.println("search page");
	}

	
	
	
	@Test (dependsOnMethods = "searchPage")

	public void openFolder(){
		System.out.println("open folder");
	}

	
	@Test (dependsOnMethods = "openFolder")

		public void logOutPage(){
		System.out.println("logout page");
	}


}
