package coding_questions;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num = 10345;
		int rev = 0 ;
		
		reverseNumberUsingFor(num, rev);
		usingStringBuffer(num, rev);
		
	}

	
	
	public static void reverseNumberUsingFor(int n, int r)
	{
		
		int num =n;
		int rev= r;
		while(num!=0)
		{
			
			//num % = gives you last digit present 
			
			rev = rev*10+num%10;
			
			//for getting 1 digit removed from left 
			num = num/10;
		}
		
		
		System.out.println("Print reverse"+rev);
		
	}
	
	public static void usingStringBuffer(int n, int r)
	{
		
		int num =n;
		int rev= r;
		
		StringBuffer sb1 = new StringBuffer();
		
		StringBuffer s = sb1.append(num);
		
		StringBuffer result = s.reverse();
		
		
		System.out.println("result "+result);
		
	}
}
