package TestNG;

import org.testng.annotations.Test;

public class ExecptionTimeOutTest {

	@Test (timeOut=1000)

	public void infinate(){

		int i=10;
		while(i==1)
			System.out.println(i);
	}



}






