/*
 * ����1. ���� �� ���� �Է¹޾Ƽ�, �� ���� 50 �̻��� ������ 50�̸��� ������ 
 *        �Ǵ��غ���.
 * 
 * 
 */
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �� �� �Է�:");
		int num=scan.nextInt();
		
		if(num>=50)
		{
			System.out.println(num+"�� 50 �̻��� �� �Դϴ�.");
		}
		else
		{
			System.out.println(num+"�� 50 �̸��� �� �Դϴ�.");
		}

	}

}
