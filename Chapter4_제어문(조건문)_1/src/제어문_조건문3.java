// 2�� ����, 1�� �����ڸ� �޾Ƽ� ��Ģ���� ==> if 4��
import java.util.Scanner;
public class ���_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// ù ��° ����
		System.out.print("ù��° ���� �Է�:");
		int num1=scan.nextInt();
		// �� ��° ����
		System.out.print("�ι�° ���� �Է�:");
		int num2=scan.nextInt();
		// ������
		System.out.print("������ �Է�(+,-,*,/):");
		char op=scan.next().charAt(0);
		
		if(op=='+')
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		if(op=='-')
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		if(op=='*')
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		// ��ø ���ǹ� 
		/*
		 * 	if()
		 * 	{
		 * 		if()
		 * 		{
		 * 		}
		 * 	}
		 */
		if(op=='/')
		{
			if(num2==0)
				System.out.println("0���� ���� �� �����ϴ�."); // ����ó��
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			
		}

	}

}
