package coding_questions;

public class Swap_wo_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 10;
		int j =20;
		
		
		Swap_using_Addition(i,j);
		//in one variable add both 
		
		Swap_using_Multiplication(i,j);
		//get second number by substarcting from total get value of a 
		
		
	}
	
	
	public static void Swap_using_Addition(int i, int j)
	{
		
		int a = i;
		int b = j;
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A an b after swapping "+a+" "+b);
		
	}
	
	public static void Swap_using_Multiplication(int i, int j)
	{
		
		int a = i;
		int b = j;
		a= a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("A an b after swapping "+a+" "+b);
		
	}

}
