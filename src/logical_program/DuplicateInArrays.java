
package logical_program;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrays {
	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		HashMap<String,Integer> map= new HashMap<>(); // objecy of Hashmap Table
		for(String str : names) // to get the value of aaray
		{
			if(map.containsKey(str)) // compare whether map table contain array string value or not
			{
				map.put(str, map.get(str)+1); // if it is present then make value appearance 2
			}
			else
			{
				map.put(str,1); // if not make it 1
			}
		}
		// to fetch data from map table we required to use keyset method
		           Set<String> set = map.keySet();
		for  (String value : set) 
		{
			if(map.get(value)>1)
			{
				System.out.println(value +" "+map.get(value));
			}
			
		}

		
}
}

