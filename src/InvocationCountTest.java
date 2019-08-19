import org.testng.annotations.Test;


public class InvocationCountTest {

	@Test (invocationCount=20)
	
	public void sum(){
		
		int a=100;
	
        int b=200;
       
        int c=a+b;
        
        System.out.println("sum="+c);
	
	
	
	
	}
}
