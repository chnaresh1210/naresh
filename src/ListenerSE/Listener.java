package ListenerSE;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		 System.out.println("test case start:" +result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case successfully:" +result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		 System.out.println("test case failure:" +result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		 System.out.println("test case skipped:" +result.getName());
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
