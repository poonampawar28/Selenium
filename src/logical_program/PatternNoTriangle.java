package logical_program;

public class PatternNoTriangle {
	public static void main(String[] args) {
		int spc=3;
		int no=1;
		for (int i =1; i <=7; i++) 
		{
			for (int j = 1; j <=spc; j++) 
			{
			System.out.print(" ");	
			}
			for (int j = 1; j <=no; j++) 
			{
				System.out.print(j+" ");
			}
			if(i<4)
			{
				no++;
				spc--;	
			}
			else
			{
				no--;
				spc++;
			}
			
			System.out.println();
		}
	}

}
