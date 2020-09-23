package logical_program;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class VerifyKeyinHashMap {
	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<>();
		map.put("abc",1);
		map.put("psp",1);
		map.put("rsp4",2);
		map.put("sap",1);
		Set<Entry<String, Integer>> entry = map.entrySet();// to print hashMap table we have to use this & then iterte
		for (Entry<String, Integer> entry2 : entry)
		{
			System.out.println(entry2);
		}
		System.out.println(map.containsKey("psp"));
		System.out.println(map.containsKey("rsp"));
		
		
	}

}
