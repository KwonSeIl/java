/*
 *   ���� ���� :
 *      1. ���� ���� ����
 *      2. ���ڿ� ���� ���� : String
 *      3. Ű����� ���� ������ �ϳ� �Է� ����
 *      4. �Է¹��� ������ ¦���̸� "¦����" �� ���ڿ������� ����ϰ�,
 *         ¦���� �ƴϸ� "Ȧ����"�� ���ڿ������� ����ϰ� 
 *         ���ڿ����� �� �����
 *      <¦���� ����>
 *          � ���� 2�� ���� �������� 0�� ������ ¦����.
 */
import java.util.Scanner;

public class ����17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�:");
		int a=scan.nextInt();
		System.out.println(a%2==0?"¦����":"Ȧ����");
	}

}
