package Inheritance;

public class InheritanceEx extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			InheritanceEx obj = new InheritanceEx();
			int local_i= obj.i;
			obj.InheritanceEx(local_i);
		
			obj.parentDisplay();
			//aq		qssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssso;
		
		
	}

	private  void InheritanceEx(int i) {
		// TODO Auto-generated method stub
		System.out.println("Hello in Child class a value :"+i);
	}

}
