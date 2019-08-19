package BasicofJava;

public class IfElseIfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if condition
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("x is greater than y");
		}  

		

		//else condition

		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}  

		
		
		//else if condition
		int time1 = 22;
		if (time1 < 10) {
			System.out.println("Good morning.");
		} else if (time1 < 20) {
			System.out.println("Good day.");
		}  else {
			System.out.println("Good evening.");
		}

		
		//switch condition
		 int day = 4;
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		    }



	}

}
