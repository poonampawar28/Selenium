package logical_program;

public class LeapYear {
	public static void main(String[] args) {
		int year=2012;
		if(year%4==0 && year%100==0 && year%400!=0)
		{
			System.out.println(year+ "is not Leap Year");
		}
		else
		{
			System.out.println(year+ "is not Leap Year");
		}
	}

}
