// �⵵ �Է¹޾� ���� ���� Ȯ��
/*
 *  ������ ���� (�θ��ô� ������ ����) 
 *    1) 4�⸶��  (year%4==0)
 *    2) 100�⸶�� ���� (year%100!=0)
 *    3) 400�⸶�� (year%400==0)
 */
import java.util.Scanner;
public class ���׿�����_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		// ����� ���
		System.out.println((year%4==0 && year%100!=0)|| (year%400==0)?year+"�⵵�� �����Դϴ�.":year+"�⵵�� ������ �ƴմϴ�.");
		

	}

}
