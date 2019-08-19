package JavaInterviewQandA;

import sun.security.util.Length;

public class ReveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		
//		1.Using Loop
		
		String str ="Selenium";
		
		int length = str.length();
		
		String rev= "";
		
		for(int i=length-1; i>=0; i--){
			rev = rev+str.charAt(i);
//			System.out.println(rev);
		
		}
	System.out.println(rev);
	
	
	
//	2.Using String Buffer class
	
		String str1 ="Selenium";
		
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.println(sb.reverse());
		
//	}

	
	// how to revers a string in a java
	
	 // Using StringBuffer class
	
	StringBuffer a = new StringBuffer("Software Testing Material");
	 // use reverse() method to reverse string
	
	System.out.println(a.reverse());
	}
}
