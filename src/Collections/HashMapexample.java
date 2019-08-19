package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapexample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(0, "naresh");
		map.put(1, "choppara");
		map.put(2, "pradeep");
		map.put(3, "karumanchi");
		map.put(4, "ongole");
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("ongole"));
		
		

	}

}
