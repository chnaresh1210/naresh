/**
 * 
 */
package FirstPackage;

import org.openqa.selenium.WebDriver;

/**
 * @author suresh
 *
 */

public class TestCase_1 {
	

public void openQAURL(WebDriver driver, String url) {
	// TODO Auto-generated method stub
	//in Selenium driverobject.get("URL string") -> open a web link
	driver.get(url);
	
	System.out.println("Title of the page is ::"+driver.getTitle());
	String actual_title;
	actual_title = driver.getTitle();
	String expected_title;
	expected_title = "Demo form for practicing Selenium Automation";
	if (expected_title == actual_title) {
		System.out.println("Title of the page is matched");
	}
	System.out.println("Title of the page is NOT matched");
	

}


}
