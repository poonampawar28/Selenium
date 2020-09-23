package logical_program;

import java.util.Scanner;

public class ArmtrongNumber {
	public static void main(String[] args) {
		System.out.print("Enter Number = ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		//int num= 100; // 1^3+5^3+3^3=1+125+27=153;
		int rem;
		int sum=0;
		for (int i = num; i>0 ;i=i/10) 
		{
			rem = i%10;
			sum= sum+rem*rem*rem;
		}
		if (num==sum)
		{
			System.out.println(num+"  is Armtromg Number");
		}
		else
		{
			System.out.println(num+" is not Armtromg Number");
		}
		sc.close();
	}
	

}
