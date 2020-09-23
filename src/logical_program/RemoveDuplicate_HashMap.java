package logical_program;

import java.util.HashSet;

//import java.util.HashMap;

//import collection.Hash_Set;

public class RemoveDuplicate_HashMap {
	public static void main(String[] args) {
		String[] ar= {"abc","xyz","abc","psp"};
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		HashSet<String> hs= new HashSet<>();
		for (String value : ar) 
		{
			hs.add(value);
		}
		 System.out.print(hs);
		
	}

}
