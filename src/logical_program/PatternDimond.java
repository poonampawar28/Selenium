package logical_program;

public class PatternDimond {
	public static void main(String[] args) {
		int spc=3;
		int star=1;
		for (int i = 1; i <=7; i++) 
		{
			for (int j = 1; j <=spc; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=star; j++) 
			{
				System.out.print("* ");
			}
			if(i<4)
			{
				spc--;
				star++;
			}
			else
			{
				spc++;
				star--;
			}
			System.out.println();
		
		}
		
	} 

}
