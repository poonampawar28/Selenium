package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hashset {
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("poonam");
		lhs.add("shinde");
		lhs.add("DOB"+31289);
		lhs.add("pawar");
		lhs.add("reyansh");
		lhs.add("sameer");
		System.out.println(lhs);
		System.out.println(lhs.contains("sameer"));
		lhs.remove("shinde");
		lhs.add("pawar");
		System.out.println(lhs);
		Iterator it = lhs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
