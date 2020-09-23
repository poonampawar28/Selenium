package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set1 {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("poonam");
		hs.add("312");
		hs.add('A');
		hs.add("poonam");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.contains("poonam")); 
		System.out.println(hs.size());
		hs.add("xyz");
		System.out.println(hs.clone());
//		hs.clear();
//		System.out.println(hs);
		Iterator it = hs. iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList al= new ArrayList();
		al.add("poonam");
		al.add("abc");
		al.add(12);
		al.add(null);
		al.add('P');
		al.add("abc");
		System.out.println(" ***** Array LIst******");
		System.out.println(al);
		System.out.println("****printing HAshSet***");
		//copy all data from Array list to HAshSet
		HashSet hs1= new HashSet(al);
		System.out.println(hs1);
		
		
		
		
		
	}

}
