package coding_questions;

public class Method_sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = {2,6,9,4,0};
		
	int	sum= SumOfArray(a);
		System.out.println("Array sum "+sum);
		
	}

	private static int SumOfArray(int[] a) {
		// TODO Auto-generated method stub
		int add =0;
		for(int i=0;i<a.length;i++)
		{
			 add = add+a[i];
			
		}
		
		return add;
	}

	
}
