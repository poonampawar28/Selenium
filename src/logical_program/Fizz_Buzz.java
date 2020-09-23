package logical_program;

import java.util.Scanner;

/*Given a number n for each integer i in the range of 1 to n inclusive, print one value pre line
 * as follow
 * 1.if i is multiple of 3 and 5.print FizzBuzz
 * 2.if i is multiple of 3(not 5)print Fizz
 * 3.if i is multiple of 5(not 3)print Buzz
 * 4.if i is not  multiple of 3 & 5.print i
 */

public class Fizz_Buzz {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value n=");
		int n= sc.nextInt();
		for (int i = 1; i <=n; i++) 
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("FizzBuzz");
				
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		sc.close();
		
	}

}
