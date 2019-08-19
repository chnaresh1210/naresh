package FirstPackage;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'z'; //A-Z AScII 65-90; a-z = 97-122
		//int b = a%2;
		switch(a%2)
		{
		case 0:
		{
			System.out.println("a is even, a= "+a);
			break;
		}
		case 1:
		{
			System.out.println("a is odd, a= "+a);
			break;
		}
		
		default:
		{
			System.out.println("a is neither even nor odd , a= "+a);
		}
		
		
		}

	}

}
