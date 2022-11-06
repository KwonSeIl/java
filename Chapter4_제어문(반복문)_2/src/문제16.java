/*
 *     ★
 *    ★★
 *   ★★★
 *  ★★★★
 *  for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
 *  
 *  
 *  i
 *  1	5   6-i
 */
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		 *
		 * 		**
		 * 	   ***
		 * 	  ****
		 *		i  j  k
		 *	   줄  공백  별
		 *		1  3   1      i+j=4  ->j=4-i  i=k
		 *	    2   2    2
		 *      3   1   3
		 *      4   0   4
		 *      
		 *      1  0  4		j+1=i=>j=i-1	k=5-i
		 *      2  1  3
		 *      3  2  2
		 *      4  3  1 
		 *      
		 *      for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

				 *
				***
			   ***** -----4줄
			   
			   i+j=4. j=4-i  i*2-1=j
			   
			   		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 */
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
