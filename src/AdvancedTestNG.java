import org.testng.annotations.Test;


public class AdvancedTestNG {

	@Test

	public void login(){
		System.out.println("login page");
//		int a= 9/0;
	}

	@Test (dependsOnMethods="login")

	public void homepage(){
		System.out.println("enter home page");
	}

	@Test (dependsOnMethods="homepage")

	public void registrationform(){
		System.out.println("successfully completed registrationform");
	}

	@Test (dependsOnMethods="registrationform")

	public void billpayment(){
		System.out.println("successfully completed billpayment");
	}


	@Test (dependsOnMethods="billpayment")

	public void paymentsuccessfully(){
		System.out.println("successfully completed payment");
	}

	@Test (dependsOnMethods="paymentsuccessfully")

	public void closebrowser(){
		System.out.println("close browser");
	}

}
