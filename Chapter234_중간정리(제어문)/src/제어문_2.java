import java.util.Scanner;

//�޴�
public class ���_2 {
	/*
	 * 	if()  ---> true
	 * 	{
	 * 		1����
	 * 	}
	 * 	if() ---> false
	 * 	{
	 * 		2����
	 * 	}
	 * 	else
	 * 	{
	 * 		3����
	 * 	}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== �޴� ====");
		System.out.println("1. HOME");
		System.out.println("2. ȸ������");
		System.out.println("3. Ŀ�´�Ƽ");
		System.out.println("4. ��õ&����");
		System.out.println("5. ����������");
		System.out.println("6. ����");
		System.out.println("=============");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�޴� ����:");
		
		int menu=scan.nextInt();
		if(menu>=1 && menu<=6)
		{
		
			if(menu==1)
				System.out.println("HOME���� �̵��մϴ�");
			else if(menu==2)
				System.out.println("ȸ���������� �̵��մϴ�.");
			else if(menu==3)
				System.out.println("�Խ������� �̵��մϴ�.");
			else if(menu==4)
				System.out.println("��õ�̳� �������� �̵��մϴ�.");
			else if(menu==5)
				System.out.println("������������ �̵��մϴ�.");
			else 
			{
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}
		else
		{
				System.out.println("�������� �ʴ� �޴��Դϴ�");
		}
		// 1. ����� ��(����� �) ==> if,if~else, �������ǹ� ����
		// 2. �ش� ���� => ����ڸ� ����
		

	}

}
