package collection;

import java.util.TreeSet;

public class Tree_set {
	public static void main(String[] args) {
		TreeSet tr= new TreeSet();
		tr.add("poonam");
		tr.add("Reyansh");
		tr.add("sameer");
		tr.add("123");
		System.out.println(tr);
		// read No as A String 
		tr.add("312");
		tr.add("555");
		tr.add("1");
		System.out.println(tr);
	}

}
