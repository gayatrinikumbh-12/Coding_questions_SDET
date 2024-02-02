package coding_questions;

public class sort_array {

	//private static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {19,30,5,8,15,16};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[j]<a[i])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int b:a)
		{
			System.out.println("Sort array "+b);
		}
		
		
		
	}

}
