package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Elements {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("abc");
		v.add(12);
		v.add(null);
		v.add('P');
		v.add("abc");
		System.out.println(v);
		v.add(0, "Poonam");
		System.out.println(v);
		v.add(4, "Reyansh");
		System.out.println(v);
		v.set(1, "Sameer");
		System.out.println(v);
		Iterator it = v.iterator();
		System.out.println("***Print all Elements using iterator*****");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("***Print all Elements using Enumerator*****");
		 Enumeration em =v.elements();
		 while(em.hasMoreElements())
		 {
			 System.out.println(em.nextElement());
		 }
		 v.remove(2);
		 System.out.println(v);
		

	}

}
