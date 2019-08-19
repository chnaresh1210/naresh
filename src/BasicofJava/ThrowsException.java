package BasicofJava;

public class ThrowsException {


	//	static void checkage(int age){
	//		if (age < 18) {
	//
	//			throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
	//
	//		} else {
	//
	//			System.out.println("Access granted - You are old enough!"); 
	//
	//		}
	//
	//	} 
	//
	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//		checkage(22); 
	//	}
	//
	//	
	
	public static void main(String[] args) {

		int a=10;
		int b=0;


		try{
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException naresh){
            naresh.getStackTrace();
			System.out.println(naresh.getMessage());
		}
	
//	public static void main(String[] args) {
	
//	int [] x=new int[3];
//	
//	x[0]=10;
//	x[1]=20;
//	x[2]=30;
//	
//	
//	try{
//	System.out.println(x[4]);
//	}
//	catch(ArrayIndexOutOfBoundsException naresh){
//		naresh.printStackTrace();
//		System.out.println(naresh.getMessage());
//	}
//	System.out.println(x[2]);
//	System.out.println(x[1]);
//	
	
	
	
	}
}