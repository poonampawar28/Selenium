package logical_program;

import java.util.Scanner;

public class MultiplyNo_withmultification {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		for (int i = 1; i <=num1; i++) 
		{
			sum= sum+num2;
		}
		System.out.println("Multification of two no is "+sum);
		sc.close();
	}

}
