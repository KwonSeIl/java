/*
 * 	1) ���ǹ� ��ø
 * 	 if(���ǹ�) ==>�α���
 * 	 {
 * 		if(���ǹ�)
 * 		{
 * 			=============> if(���ǹ� && ���ǹ�) ==> Admin �޴� 
 * 		}
 * 		else ==> User
 * 		{
 * 			=============> User �޴�
 * 		}
 * 	 }
 * 	 else
 * 	 {
 * 		Guest	==========> �Ϲ� �޴� 
 * 	 }
 * 
 * 	2) ���ù� ��ø ===> ����, ��Ʈ��ũ���� �����
 * 	 switch(��)
 * 	 {
 * 		case ��:
 * 			switch(����)
 * 			{
 * 				case ��:
 * 			}
 * 			break;
 * 	 }
 * 	3) �ݺ��� ��ø 
 * 	 	======> for
 * 		for()
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 
 * 		for()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 
 * 		while()
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 		while()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 		=======================
 * 		���� for��
 * 		for() 	=====> �� �� ���
 * 		{
 * 			for()
 * 			{
 * 				���� ��¹�
 * 			}
 * 			\n
 * 		}
 * 
 * 		��)
 * 		A
 * 		AB
 * 		ABC
 * 		ABCD
 * 		ABCDE
 * 		ABCDEF ==> 6�� 
 * 
 * 
 * 		===> ������ġ
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * 		����)
 * 					 |false-> for�� ����
 * 				 1  -> 2 -> 7  
 * 			for(�ʱⰪ;���ǽ�;������;)
 * 			{
 * 					  |true
 * 			-------------------
 * 						 |false -> 1�� for���� ���������� �ö� 
 * 					 3 -> 4  <- 6
 * 				for(�ʱⰪ;���ǽ�;������)
 * 				{
 * 						|true ��
 * 					���๮�� 5
 * 				}
 * 			---------------------
 * 			}
 * 
 * 			==> ��) for(int i=1;i<=3;i++)
 * 					{
 * 						for(int j=1;j<=3;j++)
 * 						{
 * 						}
 * 					}
 * 				
 * 					i=1 --> j=1,2,3
 * 					i=2 --> j=1,2,3
 * 					i=3 --> j=1,2,3
 * 					i�� false�� ���� 
 */
public class �ݺ���_��øfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڡڡڡڡ�");
		System.out.println("�ڡڡڡڡ�");
		System.out.println("�ڡڡڡڡ�");
		System.out.println("�ڡڡڡڡ�");
		System.out.println("�ڡڡڡڡ�");
		
		//1�� for��
		for(int i=1;i<=5;i++)
			System.out.print("��");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("��");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("��");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("��");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("��");
		System.out.println();
		
		//2�� for��
		System.out.println("2�� For�� �̿�");
		//�ټ� ==>5
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				System.out.println("��");
			System.out.println();
		}
		

	}

}
