/*
 * 	AAAAA
 * 	------->5
 * 	BBBBB
 * 	CCCCC
 * 	DDDDD
 * 	EEEEE
 * 	------->�ټ� 5
 * 	for(i=1;i<=5;i++)
 * 	{
 * 		
 * 		for(int j=1;j<=5;j++)
 * 		{
 * 			
 * 		}
 * 		System.out.println();
 * 	}
 */
public class �ݺ���_��øfor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
				//c++; ==> ABCDE
			}
			c++;
			System.out.println();
		}

	}

}
