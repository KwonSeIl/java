/*
 * 	switch()
 * 	{
 * 		case1:
 * 			switch()
 * 			{
 * 			}
 * 	}
 */
import java.util.Scanner;
public class ���_���ù�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2):");
		int user=scan.nextInt();
		// ��ǻ��(����)
		int com=(int)(Math.random()*3); //0~2
		/*
		 * String[]res= {"����","����","��"}; System.out.println("��ǻ��:"+res[com]);
		 * System.out.println("�����:"+res[user]);
		 */
		switch (com)
		{
			case 0:
				System.out.println("��ǻ��: ����");
				break;
			case 1:
				System.out.println("��ǻ��: ����");
				break;
			case 2:
				System.out.println("��ǻ��: ��");
				break;
		}
		switch (user)
		{
			case 0:
				System.out.println("�����: ����");
				break;
			case 1:
				System.out.println("�����: ����");
				break;
			case 2:
				System.out.println("�����: ��");
				break;
		}
		
		//����� ���
		switch(com)
		{
		case 0: //����
			switch(user)
			{
				case 0:
					System.out.println("���!");
					break;
				case 1:
					System.out.println("����� Win!");
					break;
				case 2:
					System.out.println("��ǻ�� Win!");
					break;
				
			}
			switch(user)
			{
				case 0:
					System.out.println("��ǻ�� Win!");
					break;
				case 1:
					System.out.println("���!");
					break;
				case 2:
					System.out.println("����� Win!");
					
				
			}
			break;
		case 1: //����
			switch(user)
			{
				case 0:
					System.out.println("��ǻ�� Win!");
					break;
				case 1:
					System.out.println("���!");
					break;
				case 2:
					System.out.println("����� Win!");
					
				
			}
			break;
		case 2: //��
			switch(user)
			{
				case 0:
					System.out.println("����� Win!");
					break;
				case 1:
					System.out.println("��ǻ�� Win!");
					break;
				case 2:
					System.out.println("���!");
					break;
				
			}
			break;
		}
		
		
	}

}
