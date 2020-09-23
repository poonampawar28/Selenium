package logical_program;

import java.util.HashMap;
import java.util.Set;

public class DuplicateAlphabet_InString {
	public static void main(String[] args) {
		String str= "poonamsameerpawar";
		        char[] chater = str.toCharArray();
		        System.out.println(chater);
		        HashMap<Character,Integer> map= new HashMap<>();
		        
		        for  (char c : chater) 
		        {
					if (map.containsKey(c))
					{
						map.put(c,map.get(c)+1);
					}
					else
					{
						map.put(c,1);
					}
				}
		        
		                 Set<Character> set = map.keySet();
		                 for (Character character : set) 
		                 {
							if(map.get(character)>1)
							{
								System.out.println("duplicate character is    "+ character+" = " +map.get(character));
							}
						}
	}

}
