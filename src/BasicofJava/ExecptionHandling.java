package BasicofJava;

public class ExecptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int[] myNumbers = {1, 2, 3};
		//
		//		try{
		//			System.out.println(myNumbers[10]); 
		//		}
		//		catch(ArrayIndexOutOfBoundsException naresh){
		//			System.out.println("ArrayIndexOutOfBoundsException");
		//		}
		//		System.out.println(myNumbers[0]);
		//		System.out.println(myNumbers[1]);

		try {

			int[] myNumbers = {1, 2, 3};

			System.out.println(myNumbers[10]);

		} catch (Exception e) {

			System.out.println("Something went wrong.");

		}
		finally{
			System.out.println("after finished try catch method");
		}
	}

}




