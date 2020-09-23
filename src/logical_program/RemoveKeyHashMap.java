package logical_program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveKeyHashMap {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map= new HashMap<>();
		map.put(1,1);
		map.put(2,1);
		map.put(3,1);
		map.put(4,1);
		map.put(5,1);
		Set<Entry<Integer, Integer>> entry =  map.entrySet();
		for  (Entry<Integer, Integer> entry2 : entry) 
		{
			System.out.println(entry2);
		}
		System.out.println("**** after Removing Key****");
		map.remove(4);
		for (Entry<Integer, Integer> entry2 : entry) 
		{
			System.out.println(entry2);
		}
	}

}
