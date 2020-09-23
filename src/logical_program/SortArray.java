package logical_program;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] ar= {20,30,10,90,40,50,5};
		System.out.println("******Array Elements*******");
		for (int i = 0; i < ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("*** After Sorting Array***");
		Arrays.sort(ar);
		for (int i = 0; i < ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("*** Descending order****");
		for (int i = ar.length-1; i >=0 ; i--) 
		{
			System.out.println(ar[i]);
		}
		
	}

}
