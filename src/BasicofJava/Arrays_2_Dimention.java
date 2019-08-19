package BasicofJava;

public class Arrays_2_Dimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] []=new int[3][5];
		
		System.out.println(a.length);

		System.out.println(a[0].length);
		
		//1st row
		a[0][0]=11;
		a[0][1]=22;
		a[0][2]=33;
		a[0][3]=44;
		a[0][4]=55;
		
		//2nd row
		a[1][0]=111;
		a[1][1]=222;
		a[1][2]=333;
		a[1][3]=444;
		a[1][4]=555;
				
		//3rd row		
		a[2][0]=1111;
		a[2][1]=2222;
		a[2][2]=3333;
		a[2][3]=4444;
		a[2][4]=5555;
		  
//		System.out.println(a[0][2]);  
//		System.out.println(a[0][1]);
//		System.out.println(a[1][2]);
//		System.out.println(a[2][2]);
//		System.out.println(a[1][3]);
//		System.out.println(a[0][4]);
//		System.out.println(a[1][2]);
//		
		  
		  for(int i=0;i<a.length;i++){
			  for(int j=0;j<a[0].length;j++){
				  System.out.println(a[i][j]);
			  }
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		//		int a[];
//		a=new int[3];
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		
//		System.out.println(a[2]);

//		int [] [] str={{11,22,33,44},{55,66,77,88}};
//		
//		for(int i=0;i<str.length;i++){
//		for(int j=0;j<str[i].length;j++){
//		System.out.println(str[i][j]);
//			
//		}
//		}
//		String [] [] xyz={{"SELENIUM","JAVA","COREJAVA"},{"NARESH","CHOPPARA","PRADEEP"}};
//		
//		for(int i=0;i<xyz.length;i++){
//			for(int j=0;j<xyz[i].length;j++){
//				
//				System.out.println(xyz[i][j]);
//			}
//		}
//		
		
		
		//		int [] [] naresh={{11,22,33,44,},{55,66,77,88}};
//		
//		System.out.println(naresh[0][1]); 
//		System.out.println(naresh[1][2]);
//		 
		
		
		
		
		
		
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		    
//		 for (int i = 0; i < cars.length; i++) {
//		 
//			 System.out.println(cars[i]);
//		    
//		 }

		
		
		
		
		
		//		int [] a=new int[10];
//		
//		a[0]=10;
//		a[1]=100;
//		a[2]=1000;
//		a[3]=10000;
//		a[4]=100000;
//		a[5]=1000000;
//		a[6]=10000000;
//		a[7]=100000000;
//		a[8]=1000000000;
//		a[9]=1000110001;
//		
//		System.out.println(a[2]);
//		System.out.println(a[2]+a[4]);
	

		
		
		
		
		
		//	String [] xyz={"JAVA","SELENIUM","TESTNG","DDT","JENKINS"};
//	xyz [3]="NARESH";
//	System.out.println(xyz[4]);
//	
//	   

		
		
		
		//		String [] xyz={"JAVA","SELENIUM","TESTNG","DDT","JENKINS"};
//	    char a[]={'A','B','C','D'};
//	    int b[]={11,22,33,44};
//	    boolean[] c={true,false};
//	    double d []={0.444,1.444,3.555};
//	
//	    System.out.println(a[1]);
//	    System.out.println(b[3]);
//	 
//	    try{
//	        System.out.println(c[2]);
//	    }
//	    
//	    
//	    catch (ArrayIndexOutOfBoundsException name){
//	    	System.out.println("array error");
//	    }
//	    System.out.println(d[2]);
//	     for (int i = 0; i < cars.length; i++) {
//	     System.out.println(xyz.length);
	
	}

}
