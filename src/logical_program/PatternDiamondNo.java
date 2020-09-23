package logical_program;

public class PatternDiamondNo {
	public static void main(String[] args) {
		int spc=0;
		int num=5;
		for (int i = 1; i <=5; i++) 
		{
			//int count=1;
			for (int j = 1; j <=spc; j++) 
			{
				System.out.print(" ");
			}
			
		for (int j = 1; j <=num; j++) 
		{
			System.out.print(j+" ");
			//count++;
		}
		spc++;
		num--;
		System.out.println();
		}
	}

}
