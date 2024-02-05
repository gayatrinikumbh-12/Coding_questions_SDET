package coding_questions;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s = "Suraj";
		revString(s);
		System.out.println("----2nd way ----");
		revStringUsingArray(s);
		
		usingStringbuffer(s);
		
	}

	

	
	private static void usingStringbuffer(String s) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append(s);
		
		System.out.println("using string buffer "+sb1.reverse());
	}




	public static void revString(String s)
	{
		
		char rev ;
		String rev_f = "";
		int s_l = s.length()-1;
		for(int i =s_l; i>=0;i--)
		{
			
			
			 rev = s.charAt(i);
			 rev_f = rev_f+rev;
			
			// System.out.println(rev);
		}
		System.out.println(rev_f);
	}

	
	public static void revStringUsingArray(String s)
	{
		
		char[] a = s.toCharArray();
		char rev ;
		String rev_f = "";
		int s_l = a.length-1;
		for(int i =s_l; i>=0;i--)
		{
			
			
			 rev = a[i];
			rev_f = rev_f+rev;
			
			// System.out.println(rev);
		}
		System.out.println(rev_f);
	}

}
