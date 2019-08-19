package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		
		System.out.println(set);

	
		
		boolean status = set.contains(11);
		
		System.out.println(status);
		
		set.add(111);
		System.out.println(set);
		
		set.remove(12);
		System.out.println(set);
//		
//		for(int naresh : set){
//			System.out.println(naresh);
//		}
//		
		Iterator ch = set.iterator();
		
		while( ch.hasNext()){
			
			int num= (Integer) ch.next();
			System.out.println(num);
			
		}
		
		
		
		
		
		
		
	}

}
