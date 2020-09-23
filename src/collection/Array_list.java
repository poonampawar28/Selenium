package collection;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("poonam");
		al.add("shinde");
		al.add("DOB"+31289);
		System.out.println(al);
		al.add(1, "sameer");
		System.out.println(al);
		al.add(3, "shinde");
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.set(2, "pawar");
		System.out.println(al);
		al.add(3, "(Shinde)");
		System.out.println(al);

	}

}
