/*
 * aBCDE
 * AbCDE
 * ABcDE
 * ABCdE
 * ABCDe
 * 		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print((char)(c+32)); //(char)(c+32): �빮�� => �ҹ��ڷ� ���� 
				else
				{
					System.out.print(c);
					
				}
				c++;
			}
			System.out.println();
		}
		
*	�ֻ��� �ΰ� ���� ��5�� ������ ����� �� ���
*	[1,4][2,3][3,2][4,1]
*
*	7
*	[1,6][2,5][3,4][4,3][5,2][6,1]
*
*	1 			=> 165page. ***166page �߿�!!!!!!
*		2
*			3
*				4
*					5
*
*/

import java.util.Scanner;
public class �ݺ���_��øfor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print((char)(c+32)); //(char)(c+32): �빮�� => �ҹ��ڷ� ���� 
				else
				{
					System.out.print(c);
					
				}
				c++;
			}
			System.out.println();
		} */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("2~12������ ������ �Է�:");
		int hap=scan.nextInt();
		
		for(int i=1;i<=6;i++) //ù��° �ֻ���
		{
			for(int j=1;j<=6;j++) //�ι�° �ֻ���
			{
				if(i+j==hap)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}

	}

}
