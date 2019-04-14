package javaRefresher;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "BMW");
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda");
		
		
		for (Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			System.out.println(entry);
		}
		for (Integer key:hashMap.keySet()) {
			System.out.println(key);
		}

	}

}
