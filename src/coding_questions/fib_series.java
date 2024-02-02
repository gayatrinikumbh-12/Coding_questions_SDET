package coding_questions;

public class fib_series {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			//0 1 2 3 		//1 , 2 , 3
		int ser=0;   
		// 1 , 2, 3, 5, 8 , 13
		
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				
				ser = i+j;
				
				System.out.println("Ser" +ser);
			}
			
		}
	}

}
