//1~10���� ¦�� ���
public class ���_�ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		/*
		 * 	2 => i<=10 true ==> 2���
		 * +2
		 * 	4 => i<=10 true ==> 4���
		 * +2
		 * 	6 => i<=10 true ==>6���
		 * +2
		 * 	8 => i<=10 ture ==>8���
		 * +2
		 * 	10 => i<=10 true ==>10��� 
		 * +2
		 *	12 => i<=10 false ==> ���� 	
		 */
		for(int i=2;i<=10;i+=2) //�ʱⰪ(��𼭺���), ���ǽ�(������ ��������), ������(��� ����)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
