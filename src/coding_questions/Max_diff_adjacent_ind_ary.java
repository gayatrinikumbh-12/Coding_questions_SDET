package coding_questions;

public class Max_diff_adjacent_ind_ary {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub

		int a[] = {19,30,5,8,15,16};
		int diff = 0;
		for(int i=0;i<a.length-1;i++)
		{
			
		
				
				if((a[i+1]-a[i])>diff)
				{
					
					diff=a[i+1]-a[i];
				}	
					
				
			
			
		}
		
		System.out.println("diff"+diff);
	}
	

}
