/*
 * 	1####
 * 	#2###
 * 	##3##
 * 	###4#
 * 	####5
 * 	�ټ�:5 ����:5
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
 * 	�ڡ١١١�
 * 	�١ڡ١١�
 * 	�١١ڡ١�
 * 	�١١١ڡ�
 * 	�١١١١�
 * 
 * 	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
 * 
 * 	�١١١١� �� => i+j
 * 	�١١١ڡ�	=6
 * 	�١١ڡ١�	=6
 * 	�١ڡ١١�	=6 => i+j=6 => j=6-i  =>j=6-1=5
 * 	�ڡ١١١�							j=6-2=4 ����(������)		
 * 
 * 	i	j
 * 	1	5
 * 	2	4
 * 	3	3	
 * 	4	2
 * 	5	1	
 * 
 * 	�ڡ١١١� 
 * 	�١ڡ١ڡ�
 * 	�١١ڡ١�
 * 	�١ڡ١ڡ�
 * 	�ڡ١١١�
 * 
 * 	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((6-i==j) || (i==j))
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
 */
public class �ݺ���_��øFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((6-i==j) || (i==j))
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
