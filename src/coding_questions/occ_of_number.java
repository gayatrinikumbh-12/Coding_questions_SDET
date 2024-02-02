package coding_questions;

public class occ_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = {10, 20 , 40 ,40 , 90};
				 
				int count =1;
				for(int i =0; i<a.length;i++)
				{
					//System.out.println(a.length);
					for(int j = 1;j<a.length;j++)
					{
						if(a[i]==a[j])
						{
							count++;
					 
					 
						}
					}
			
				}
		
				
				System.out.println("count "+count);
		
	}

}
