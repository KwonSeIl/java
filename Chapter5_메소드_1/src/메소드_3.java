//��Ģ����
import java.util.Scanner;
public class �޼ҵ�_3 {
	// + => ������:int		�Ű�����:���� 2��
	static int add(int a,int b)
	{
		return a+b;
	}
	// - 
	static int minus(int a,int b)
	{
		return a-b;
	}
	// *
	static int gop(int a,int b)
	{
		return a*b;
	}
	// /
	static int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�:");
		int a=scan.nextInt();
		System.out.print("�� ��° ���� �Է�:");
		int b=scan.nextInt();
		
		// ������
		System.out.print("������ �Է�(+,-,*,/):");
		String op=scan.next();
		
		int result=0; //long, double�� �޾Ƶ� ���X
		switch (op) 
		{
		case "+":
			result=add(a, b); //result��: a+b (return���� �޾� ����)
			// ȣ�� --> �޼ҵ��(�Ű������� ����=> ���� ���� ����)
			// ȣ�� --> �޼ҵ� {��ü�� ����} => ���� �� ȣ���� ��ġ�� �ٽ� ���ƿ�
			// �޼ҵ�� ��ü�� �� ������
			break;
		case "-":
			result=minus(a, b);
			break;
		case "*":
			result=gop(a, b);
			break;
		case "/":
			result=div(a, b);
			break;
		}
		System.out.println("result:"+result);

	}

}
