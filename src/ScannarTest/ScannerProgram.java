package ScannarTest;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String userName;
		    
		    // Enter username and press Enter
		    
		    System.out.println("Enter username"); 
		   		    
		    userName = scan.nextLine();   
		       
		    System.out.println("Username is: " + userName);    

		    //enter the user phone number
		    
		    System.out.println("Enter the user phone number");
		    
		    String phonenumber;
		    
		    phonenumber=scan.nextLine();
		   
		    System.out.println("phone number is:" +phonenumber);
	
	       //enter the user address
		    
		    System.out.println("enter the user address");
		    
		    String address = scan.nextLine();
		    
		    System.out.println("address:"+address);
		    
	
		    
		    
		    
		    
	
	
	
	
	}

}
