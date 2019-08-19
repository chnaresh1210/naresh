package FirstPackage;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1234;
		int sum=0;
		int remainder;
		System.out.println("Number value is "+number);
		while (number > 0){
			//int iterator = 1;
			//System.out.println("Number value is "+number);
			remainder = number%10;
			number=number/10;
			sum=sum+remainder; 		
			
		}
		System.out.println("Sum is "+sum);
	}

}
