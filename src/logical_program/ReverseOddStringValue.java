package logical_program;

public class ReverseOddStringValue {
	public static void main(String[] args) {
		
		String str= "poonam sameer pawar shinde";
		System.out.println(str);
		String[] ar = str.split(" ");
		for (int i = 0; i <= ar.length-1; i++) 
		{
			if(i%2!=0)
			{
				ar[i]=reserevestring(ar[i]);
			}
		}
		
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}
	public static String reserevestring(String org)
	{
		String rev= " ";
		for (int i=org.length()-1; i>=0; i--) 
		{
			rev= rev+org.charAt(i);
		}
		return rev;
		
	}
}
