package logical_program;

public class CountWhiteSpace {
	public static void main(String[] args) {
		int count=0;
		String str= "poonam sameer pawar";
		//String[] ar = str.split(" ");
		for (int i = 0; i < str.length()-1; i++) 
		{
			  char s = str.charAt(i);
			
			if(s==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
