/*
 * 	1####
 * 	#2###
 * 	##3##
 * 	###4#
 * 	####5
 * 	줄수:5 개수:5
 * 	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(6-i==j)
					System.out.print("i");
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
 * 
 * 	★☆☆☆☆
 * 	☆★☆☆☆
 * 	☆☆★☆☆
 * 	☆☆☆★☆
 * 	☆☆☆☆★
 * 
 * 	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
		System.out.println();
 * 
 * 	☆☆☆☆★ ↓ => i+j
 * 	☆☆☆★☆	=6
 * 	☆☆★☆☆	=6
 * 	☆★☆☆☆	=6 => i+j=6 => j=6-i  =>j=6-1=5
 * 	★☆☆☆☆							j=6-2=4 수열(방정식)		
 * 
 * 	i	j
 * 	1	5
 * 	2	4
 * 	3	3	
 * 	4	2
 * 	5	1	
 * 
 * 	★☆☆☆★ 
 * 	☆★☆★☆
 * 	☆☆★☆☆
 * 	☆★☆★☆
 * 	★☆☆☆★
 * 
 * 	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((6-i==j) || (i==j))
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
		System.out.println();
 */
public class 반복문_중첩For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((6-i==j) || (i==j))
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
