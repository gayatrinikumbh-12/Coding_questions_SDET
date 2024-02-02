package coding_questions;

import java.util.ArrayList;

public class Comp_2arr_ind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {19,30,5,8,15,16};
		int b[] = {9,30,0,9,15,16};
		ArrayList <Integer> com = new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++)
		{
			
			
			
			//for(int j=0;i<b.length;i++)
			{
				
				if(a[i]==b[i])	
				{
					com.add(a[i]);
				}
			}	
		}	
		
		
		for(int s:com)
		{
			System.out.println(s);
			
		}
		
	}

}
