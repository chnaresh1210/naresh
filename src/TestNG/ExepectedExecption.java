package TestNG;

import org.testng.annotations.Test;

public class ExepectedExecption {

	@Test (expectedExceptions = ArrayIndexOutOfBoundsException.class)
	
	public void Expection(){

		int [] a={1,2,3,4,5};
		
		System.out.println(a[5]);
		
}

@Test

public void test(){
	
	String b="naresh";
	String c="pradeep";
	
	System.out.println(" b + c");
}

@Test (expectedExceptions = NumberFormatException.class)

public void test2(){
	
	String x="100AA";
	Integer.parseInt(x);
	
}



}