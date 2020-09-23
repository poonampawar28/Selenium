package logical_program;

public class CountBlank_Space {
	public static void main(String[] args) {
		int count=0;
		String ar= "ac c d e  ";
		
		System.out.println(ar.length()-ar.replace(" ","").length());
		
		for (int i = 0; i < ar.length(); i++) 
		{
			
			if(ar.charAt(i)==' ')// read space as a character
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	        

}
