/*
 * 	��
 * 	�ڡ�
 * 	�ڡڡ�
 * 	�ڡڡڡ�
 * 		 i   j 	i=j ==> j=i
 * 		�ټ�	��ǥ
 * 		 1	 1
 * 		 2	 2
 * 		 3	 3
 * 		 4	 4
 * 		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print("��");
			}
			System.out.println();
		}
 * 
 * 	�ڡڡڡ�
 * 	�ڡڡ�
 * 	�ڡ�
 * 	��
 *  	i   j 	i=j ==> j=i
 * 		�ټ�	��ǥ
 * 		 1	 4	 5-j	
 * 		 2	 3
 * 		 3	 2
 * 		 4	 1
 * 		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
					System.out.print("��");
			}
			System.out.println();
		}
 * 	A    1   1
 * 	BC	 2   2
 * 	DEF	 3   3
 * 	GHIJ 4   4
 * char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
				
			}
			System.out.println();
			
		}
 * 
 * 	A
 * 	AB
 * 	ABC
 * 	ABCD
 * 
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
			
		}
 */

import java.util.Scanner;
public class �ݺ���_��øfor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int n=scan.nextInt(); 
		//1. ������ġ
		
		for(int i=1;i<=n;i++)  //����, �� ���ϱ�, ���, ���� ���� ==> �迭
		{
			for(int j=1;j<=(n+1)-i;j++)
			{
					System.out.print("��");
			}
			System.out.println();
		} */
		
		
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
			
		}
	}

}
