package BasicofJava;

public class ClassandObject {


//		int a=100;
//		
//	
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//		
////			ClassandObject obj = new ClassandObject();
////			ClassandObject obj1 = new ClassandObject();
////			
////			System.out.println(obj.a);
////			System.out.println(obj.b);
//		
//			ClassandObject obj = new ClassandObject();
//		   
//	       obj.a = 200;
//	       
//	       System.out.println(obj.a);
		
//      final int x=121;
//      
//      public static void main(String[] args) {
//		
//    	  ClassandObject obj = new ClassandObject();
//    	  
//    	  obj.x = 144;
//    	  
//    	  System.out.println(obj.x);
    	  
	
//	
//	String xyz ="naresh";
//	
//	public static void main(String[] args) {
//	
//	 ClassandObject test = new ClassandObject();
//	 
//	 System.out.println(test.xyz);
//	 
//	 test.xyz = "choppara";
//	 
//	System.out.println(test.xyz);
//	

	
	
	
	//	String firstname ="naresh";
//	
//	String secondname ="choppara";
//	 int age = 29;
//	 
//	public static void main(String[] args) {
//	
//	ClassandObject ch = new ClassandObject();
//	
//	System.out.println("Name:" +ch.firstname+ "  " +ch.secondname);
//	System.out.println("Age:" +ch.age);
//	

	
	//     public static void Class1(){
//    	 
//    	 System.out.println("hello world");
//     }
//  
//     public static void main(String[] args) {
//		
//    	 Class1();
//	}

	//static method example
	public static int Multiply(int x, int y){
		
		//variable declaration & assignment
		//store multiplicaTION of x and y in new varable z
		int z=x*y;
		return z;
	
		
	}

	
	public static void main(String[] args) {
		//constructor initialization
	ClassandObject ch = new ClassandObject();
	
	//ch.toString();
	//Printing the contents of the constrictor
	System.out.println("Printing the contents "+ ch.toString());
	System.out.println("Multiply two variables 21,34: "+Multiply(21,34));
	
	
	
	}


}






