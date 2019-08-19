package FirstPackage;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop
		//when no of iterations are fixed
		
		for (int init = 0;init <10;init++){
			if(init==0){System.out.println( "Iteration Starts and number is  " +init);}
			else if(init==9){System.out.println( "Iteration Ends and number is  " +init);}
			else
				System.out.println( "Iteration number is  " +init);	
			
		}
		//REVERSE STAR PRINT
		for(int i=5;i>=1;i--){
			for (int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//while loop
		//when no of iterations are not fixed
		
		//do while loop
		//u must have to execute at least once
		
	}

}
