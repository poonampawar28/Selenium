package logical_program;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_InString {
	public static void main(String[] args) {
		String str= "abc xyz abc xyz1 rst rst";
		           String[] ar = str.split(" ");
		           HashMap<String,Integer> map= new HashMap<>();
		           for (String  value : ar) 
		           {
		        	   if(map.containsKey(value))
		        	   {
		        		   map.put(value, map.get(value)+1);
		        		   
		        	   }
		        	   else
		        	   {
		        		   map.put(value,1);
		        	   }
					
				}
		          Set<String> set = map.keySet();
		          for (String value1 : set) 
		          {
					if(map.get(value1)>1)
					{
						System.out.println(value1+" "+"value repeated for"+map.get(value1));
					}
				}
	}

}
