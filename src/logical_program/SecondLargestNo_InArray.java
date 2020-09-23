package logical_program;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestNo_InArray {
	public static void main(String[] args) {
		int[] ar= {10,20,30,80,90,100,50,100};
		 TreeSet tr = new TreeSet();
		 for  ( int num : ar) 
		 {
			tr.add(num);
			//System.out.println(tr.add(num));
		}
	
		 ArrayList al= new ArrayList(tr);
		 System.out.println(al.size());
		 System.out.println(al.size()-1);
		 System.out.println("Highest Number in Array  "+al.get(al.size()-1));
		 System.out.println("2nd Highest Number in Array  "+al.get(al.size()-2));
		 System.out.println(" Lowest Number in Array  "+al.get(0));
		 System.out.println("2nd lowest Number in Array  "+al.get(1));
		 
		 
	}

}
