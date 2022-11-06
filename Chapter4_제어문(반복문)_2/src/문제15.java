/*
 * 다음 결과를 출력하는 프로그램
 
 출력예) 1 2 3 4 5         
	   1 2 3 4 5    
	   1 2 3 4 5      
	   1 2 3 4 5      
	   1 2 3 4 5

 */
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=5;j++)
			{
				System.out.print(k++);
				//k++;
			}
			System.out.println();
		}
		
		
		/*
		 * 1. 형식
		 * 2. 2차 for ==>
		 * 		for()
		 * 		{
		 * 			for(;조건문;)
		 * 				------
		 * 			{
		 * 			}
		 * 		}
		 * 3. 변수위치 , 증가식 위치,
		 */

	}

}
