/*
 * 	1. Switch( )
 * 			  �� ���� / ���� / ���ڿ� 
 * 	2. ���� ����
 * 	 switch(no)
 * 	 {
 * 		case 1:
 * 		{
 * 			int a=10;
 * 			break;
 * 		} //a�� ����� 
 * 		case 2:
 * 		{
 * 			int a=20;
 * 			break;
 * 		} //a�� ����� 
 * 		case 3:
 * 		{
 * 			int a=30;
 * 			break; ====>�����߻� -> {} ó�� ����� �� 
 * 		} //a�� ����� 
 * 	 }
 * 
 * 	{
 * 		� ��ġ�� ������ ���� : ���� ���� ���� 
 * 	}
 */
public class ���_���ù������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=40; //main��ü���� ��� ==> {}�ȿ����� ���Ǵ� ���� = ��������: �ݵ�� �ʱ�ȭ �ʿ�
		if(true)
		{
			int a=10;
			if(true) 
			{
				int b=20;
				if(true)
				{
					int c=30;
				}//c
				int c=100;
			}//b
			int b=200;
		}//a
		int a=100;

		
	}

}
