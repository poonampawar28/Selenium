package logical_program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import collection.Array_list;

public class RemoveDuplicate_inArrayUsingTreeSet {
	public static void main(String[] args) {
		String[] ar= {"abc","xyz","abc","psp"};// want outPut {"abc","xyz","psp"}
		TreeSet tr= new TreeSet();
		for (  String entry:ar) 
		{
			tr.add(entry);
		} 
		Iterator it= tr.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}
	
}
