/*
 * ����ڷ� ���� ������ �Է¹޾Ƽ� ������� �������� Ȯ���ϴ� 
         ���α׷� �ۼ�

 */
import java.util.Scanner;
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		if(num>=0)
			System.out.println(num+"�� ����Դϴ�.");
		else 
			System.out.println(num+"�� �����Դϴ�.");
		
		//���� ǥ��. if~else=���׿�����
		//System.out.println(num<0?num+"�� ����":num+"�� ���");

	}

}
